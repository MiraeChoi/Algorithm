package g_recursive_tree_graph;

import java.util.Scanner;

class Ex07_12_Review {
	//����
	//����׷����� �־����� 1�� �������� N�� �������� ���� ��� ����� ���� ���� ����� ���α׷��� �ۼ��ϼ���.
	//�Ʒ� �׷������� 1�� �������� 5�� �������� ���� ���� ����
	//(�׸� 1)
	//1 2 3 4 5
	//1 2 5
	//1 3 4 2 5
	//1 3 4 5
	//1 4 2 5
	//1 4 5
	//�� 6�����Դϴ�.
	
	//�Է�
	//ù° �ٿ��� ������ �� N(1<=N<=20)�� ������ �� M�� �־�����. �� �������� M�ٿ� ���� ���������� �־�����.
	
	//���
	//�� �������� ����Ѵ�.
	static int n, m, answer = 0;
	static int[][] graph;
	static int[] ch;
	
	public void DFS(int v) {
		if(v == n) answer++;
		else {
			for(int i = 1; i < graph.length; i++) {
				if(graph[v][i] == 1 && ch[i] == 0) {
					ch[i] = 1;
					DFS(i);
					ch[i] = 0;
				}	
			}
		}
	}
	
	public static void main(String[] args) {
		Ex07_12_Review T = new Ex07_12_Review();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		graph = new int[n+1][n+1];
		ch = new int[n+1];
		for(int i = 0; i < m; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			graph[a][b] = 1;
		}
		ch[1] = 1;
		T.DFS(1);
		System.out.println(answer);
	}
}
