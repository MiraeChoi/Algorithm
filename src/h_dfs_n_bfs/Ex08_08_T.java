package h_dfs_n_bfs;

import java.util.Scanner;

class Ex08_08_T {
	//����
	//���� ���ٿ� 1���� N������ ���ڰ� �� ���� ���� �ִ�. �׸��� ��° �ٺ��� ���ʴ�� �Ľ�Į�� �ﰢ��ó�� ���� �ΰ��� ���� ���� ����ǰ� �ȴ�.
	//���� ��� N�� 4 �̰� ���� �� �ٿ� 3 1 2 4 �� �ִٰ� ���� ��, ������ ���� �ﰢ���� �׷�����.
	// 3 1 2 4
	//  4 3 6
	//   7 9
	//    16
	//N�� ���� �ؿ� �ִ� ���ڰ� �־��� ���� �� ���� ���ٿ� �ִ� ���ڸ� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	//��, ���� ���������� ������ ��쿡�� ���������� ���� �տ� ���� ���� ����Ͽ��� �Ѵ�.

	//�Է�
	//ù° �ٿ� �ΰ��� ���� N(1��N��10)�� F�� �־�����.
	//N�� ���� ���ٿ� �ִ� ������ ������ �ǹ��ϸ� F�� ���� �ؿ� �ٿ� �ִ� ���� 1,000,000 �����̴�.

	//���
	//ù° �ٿ� �ﰢ������ ���� ���� �� N���� ���ڸ� �� ĭ�� ���̿� �ΰ� ����Ѵ�.
	//���� �������� �ʴ� ���� �Է����� �־����� �ʴ´�.
	static int[] b, p, ch;
	static int n, f;
	boolean flag = false;
	int[][] dy = new int[35][35];
	
	public int combi(int n, int r) {
		if(dy[n][r] > 0) return dy[n][r];
		if(n == r || r == 0) return 1;
		else return dy[n][r] = combi(n-1, r-1) + combi(n-1, r);
	}
	
	public void DFS(int L, int sum) {
		if(flag) return;
		if(L == n) {
			if(sum == f) {
				for(int x : p) System.out.print(x + " ");
				flag = true;
			}
		} else {
			for(int i = 1; i <= n; i++) {
				if(ch[i] == 0) {
					ch[i] = 1;
					p[L] = i;
					DFS(L+1, sum+(p[L]*b[L]));
					ch[i] = 0;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Ex08_08_T T = new Ex08_08_T();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		f = kb.nextInt();
		b = new int[n];
		p = new int[n];
		ch = new int[n+1];
		for(int i = 0; i < n; i++) {
			b[i] = T.combi(n-1, i);
		}
		T.DFS(0, 0);
	}
}
