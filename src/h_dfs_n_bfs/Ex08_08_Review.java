package h_dfs_n_bfs;

import java.util.Scanner;

class Ex08_08_Review {
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
	static int n, f;
	static int[] b, p, ch;
	static int[][] dy = new int[35][35];
	boolean flag = false;
	
	public int combi(int n, int r) {
		if(dy[n][r] > 0) return dy[n][r];
		if(r == 0 || r == n) return 1;
		else return dy[n][r] = combi(n-1, r) + combi(n-1, r-1);
	}
	
	public void DFS(int L, int sum) {				//L = 0, sum = 0	L = 1, sum = 1			L = 2, sum = 7					L = 3, sum = 16				L = 4, sum = 20		L = 3, sum = 16		L = 2, sum = 7			L = 3, sum = 19						L = 4, sum = 22		
		if(flag) return;
		if(L == n) {																																		//4 == n																							4 == n
			if(sum == f) {																																	//20 != 16																							22 != 16
				for(int x : p) System.out.print(x + " ");
				flag = true;
			}
		} else {
			for(int i = 1; i <= n; i++) {			//i = 1				i = 1	i = 2			i = 1	i = 2	i = 3			i = 1 ... i = 4														i = 3	i = 4			i = 1	i = 2	i = 3
				if(ch[i] == 0) {
					ch[i] = 1;						//ch[1] = 1					ch[2] = 1						ch[3] = 1				  ch[4] = 1															ch[4] = 1						ch[3] = 1
					p[L] = i;						//p[0] = 1					p[1] = 2						p[2] = 3				  p[3] = 4															p[2] = 4						p[3] = 3
					DFS(L+1, sum+(b[L] * p[L]));	//DFS(0+1, 0+1*1)			DFS(1+1, 1+3*2)					DFS(2+1, 7+3*3)			  DFS(3+1, 16+1*4)													DFS(2+1, 7+3*4)					DFS(3+1, 19+1*3)
					ch[i] = 0;																																					//ch[4] = 0			ch[3] = 0
				}																																			//p = {1, 2, 3, 4}																					p = {1, 2, 4, 3}
			}
		}
	}
	
	public static void main(String[] args) {
		Ex08_08_Review T = new Ex08_08_Review();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		f = kb.nextInt();
		b = new int[n];
		p = new int[n];
		ch = new int[n+1];
		for(int i = 0; i < n; i++) {
			b[i] = T.combi(n-1, i);
			System.out.print(b[i] + " ");
		}
		System.out.println();
		T.DFS(0, 0);
	}
}
