package h_dfs_n_bfs;

import java.util.Scanner;

class Ex08_07_M {
	//����
	//nCr = n! / (n-r)!r!
	//�� ����մϴ�.
	//������ �������� �� ������ �����ʰ� ���� ������ ����Ͽ� ��͸� �̿��� ���ռ��� �����ִ� ���α׷��� �ۼ��ϼ���.
	//nCr = n-1Cr-1 + n-1Cr

	//�Է�
	//ù° �ٿ� �ڿ��� n(3<=n<=33)�� r(0<=r<=n)�� �Էµ˴ϴ�.

	//���
	//ù° �ٿ� ���ռ��� ����մϴ�.
	static int[][] dy;
	
	public int DFS(int n, int r) {
		if(r == 0 || n == r) return dy[n][r] = 1;
		else {
			if(dy[n][r] != 0) return dy[n][r];
			else return dy[n][r] = DFS(n-1, r-1) + DFS(n-1, r);
		}
	}
	
	public static void main(String[] args) {
		Ex08_07_M T = new Ex08_07_M();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int r = kb.nextInt();
		dy = new int[n+1][r+1];
		System.out.println(T.DFS(n, r));
		for(int i = 0; i < dy.length; i++) {
			for(int j = 0; j < dy[i].length; j++) {
				System.out.print(dy[i][j] + " ");
			}
			System.out.println();
		}
	}
}
