package g_recursive_tree_graph;

import java.util.ArrayList;
import java.util.Scanner;

class Ex07_13_Review {
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
	static int n, m, answer;
	static int[] ch;
	static ArrayList<ArrayList<Integer>> graph;
	
	public void DFS(int v) {			 //v = 1		v = 2				 v = 3		v = 4				v = 5								v = 2
		if(v == n) answer++;																				//answer = 1
		else {
			for(int nx : graph.get(v)) { //nx = 2		nx = 1	nx = 3		 nx = 4		nx = 2	nx = 5											nx = 5
				if(ch[nx] == 0) {
					ch[nx] = 1;			 //ch[2] = 1			ch[3] = 1	 ch[4] = 1			ch[5] = 1										ch[5] = 1
					DFS(nx);			 //DFS(2)				DFS(3)		 DFS(4)				DFS(5)											DFS(5)
					ch[nx] = 0;																				//ch[5] = 0		ch[4] = ch[3] = 0
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Ex07_13_Review T = new Ex07_13_Review();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		ch = new int[n+1];
		graph = new ArrayList<>();
		for(int i = 0; i < n+1; i++) graph.add(new ArrayList<>());
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
