package h_dfs_n_bfs;

import java.util.Scanner;

class Ex08_09_Review {
	//����
	//1���� N���� ��ȣ�� ���� ������ �ֽ��ϴ�. ���� M���� �̴� ����� ���� ����ϴ� ���α׷��� �ۼ��ϼ���.
	
	//�Է�
	//ù ��° �ٿ� �ڿ��� N(3<=N<=10)�� M(2<=M<=N)�� �־������ϴ�.
	
	//���
	//ù ��° �ٿ� ����� ����մϴ�.
	//��� ������ ���� ������ ������������ ����մϴ�.
	static int n, m;
	static int[] combi;
	
	public void DFS(int L, int s) {							//L=0, s=1		L=1, s=2		L=2, s=3	L=1, s=2		L=2, s=3
		if(L == m) {																		//2 == m					2 == m
			for(int x : combi) System.out.print(x + " ");									//syso(1 2)					syso(1 3)
			System.out.println();
		} else {
			for(int i = s; i <= n; i++) {					//i = 1			i = 2						i = 3
				combi[L] = i;								//combi[0] = 1  combi[1] = 2				combi[1] = 3
				DFS(L+1, i+1);								//DFS(0+1, 1+1) DFS(1+1, 2+1)				DFS(1+1, 2+1)
			}
		}
	}
	
	public static void main(String[] args) {
		Ex08_09_Review T = new Ex08_09_Review();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		combi = new int[m];
		T.DFS(0, 1);
	}
}
