package g_recursive_tree_graph;

import java.util.ArrayList;
import java.util.Scanner;

class Ex07_13_T {
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
	static ArrayList<ArrayList<Integer>> graph;
	static int[] ch;
	
	public void DFS(int v) {
		if(v == n) answer++;
		else {
			for(int nv : graph.get(v)) {
				if(ch[nv] == 0) {
					ch[nv] = 1;
					DFS(nv);
					ch[nv] = 0;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Ex07_13_T T = new Ex07_13_T();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		ch = new int[n+1];
		graph = new ArrayList<>();
		for(int i = 0; i <= n; i++) {
			graph.add(new ArrayList<Integer>());
		}
		for(int i = 0; i < m; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			graph.get(a).add(b);
		}
		ch[1] = 1;
		T.DFS(1);
		System.out.println(answer);
	}
}
