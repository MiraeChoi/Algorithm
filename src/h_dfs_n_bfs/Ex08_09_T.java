package h_dfs_n_bfs;

import java.util.Scanner;

class Ex08_09_T {
	//����
	//1���� N���� ��ȣ�� ���� ������ �ֽ��ϴ�. ���� M���� �̴� ����� ���� ����ϴ� ���α׷��� �ۼ��ϼ���.
	
	//�Է�
	//ù ��° �ٿ� �ڿ��� N(3<=N<=10)�� M(2<=M<=N)�� �־������ϴ�.
	
	//���
	//ù ��° �ٿ� ����� ����մϴ�.
	//��� ������ ���� ������ ������������ ����մϴ�.
	static int[] combi;
	static int n, m;
	
	public void DFS(int L, int s) {
		if(L == m) {
			for(int x : combi) System.out.print(x + " ");
			System.out.println();
		} else {
			for(int i = s; i <= n; i++) {
				combi[L] = i;
				DFS(L+1, i+1);
			}
		}
	}
	
	public static void main(String[] args) {
		Ex08_09_T T = new Ex08_09_T();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		combi = new int[m];
		T.DFS(0, 1);
	}
}
