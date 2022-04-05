package h_dfs_n_bfs;

import java.util.Scanner;

class Ex08_06_Review {
	//����
	//10 ������ N���� �ڿ����� �־����� ���� M���� �̾� �Ϸķ� �����ϴ� ����� ��� ����մϴ�.
	
	//�Է�
	//ù ��° �ٿ� �ڿ��� N(3<=N<=10)�� M(2<=M<=N)�� �־����ϴ�.
	//�� ��° �ٿ� N���� �ڿ����� ������������ �־����ϴ�.
	
	//���
	//ù ��° �ٿ� ����� ����մϴ�.
	//��� ������ ���� ������ ������������ ����մϴ�.
	static int n, m;
	static int[] arr, ch, pm;
	
	public void DFS(int L) {			//L = 0			L = 1				L = 2			L = 1					L = 2		L = 1		L = 0
		if(L == m) {
			for(int x : pm) System.out.print(x + " ");						//Syso(3 6)								Syso(3 9)
			System.out.println();
		} else {
			for(int i = 0; i < n; i++) {//i = 0			i = 0   i = 1						i = 1		i = 2					i = 2		i = 0		i = 1
				if(ch[i] == 0) {
					ch[i] = 1;			//ch[0] = 1				ch[1] = 1								ch[2] = 1										ch[1] = 1
					pm[L] = arr[i];		//pm[0] = 3				pm[1] = 6								pm[1] = 9										pm[0] = 6
					DFS(L+1);			//DFS(0+1)				DFS(1+1)								DFS(1+1)										DFS(0+1)
					ch[i] = 0;																//ch[1] = 0							ch[2] = 0	ch[0] = 0
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Ex08_06_Review T = new Ex08_06_Review();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		ch = new int[n];
		pm = new int[m];
		T.DFS(0);
	}
}
