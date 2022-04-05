package h_dfs_n_bfs;

import java.util.Scanner;

class Ex08_06_T {
	//����
	//10 ������ N���� �ڿ����� �־����� ���� M���� �̾� �Ϸķ� �����ϴ� ����� ��� ����մϴ�.
	
	//�Է�
	//ù ��° �ٿ� �ڿ��� N(3<=N<=10)�� M(2<=M<=N)�� �־����ϴ�.
	//�� ��° �ٿ� N���� �ڿ����� ������������ �־����ϴ�.
	
	//���
	//ù ��° �ٿ� ����� ����մϴ�.
	//��� ������ ���� ������ ������������ ����մϴ�.
	static int[] pm, ch, arr;
	static int n, m;
	
	public void DFS(int L) {
		if(L == m) {
			for(int x : pm) System.out.print(x + " ");
			System.out.println();
		} else {
			for(int i = 0; i < n; i++) {
				if(ch[i] == 0) {
					ch[i] = 1;
					pm[L] = arr[i];
					DFS(L+1);
					ch[i] = 0;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Ex08_06_T T = new Ex08_06_T();
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
