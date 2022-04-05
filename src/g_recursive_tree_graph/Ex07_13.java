package g_recursive_tree_graph;

import java.util.Scanner;
import java.util.Vector;

class Ex07_13 {
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
	static Vector<int[]> arr = new Vector<int[]>();
	static int[][] graph;
	
	public void BFS(int v) {
		int[] tmp = new int[n+1];
		tmp[0] = 0;
		arr.add(0, tmp);
		
		while(arr.size() < n+1) {
			tmp = new int[n+1];
			
			for(int i = 1; i <= n; i++) {
				if(graph[v][i] == 1) tmp[i] = i;
				else tmp[i] = 0;
			}
			arr.add(v, tmp);
			v++;
			
			for(int i = 1; i < arr.size(); i++) {
				System.out.print(i + ": ");
				for(int j = 1; j < arr.get(i).length; j++) {
					if(arr.get(i)[j] != 0) System.out.print(arr.get(i)[j] + " ");
				}
				System.out.println();
			}
			System.out.println("---------------------");
		}
//		answer = arr.size();
	}
	
	public static void main(String[] args) {
		Ex07_13 T = new Ex07_13();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		graph = new int[n+1][n+1];
		for(int i = 0; i < m; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			graph[a][b] = 1;
		}
		T.BFS(1);
		System.out.println(answer);
	}
}