package h_dfs_n_bfs;

import java.util.Scanner;

class Ex08_06_M {
	static int n, m;
	static int[] arr, ch, pm;
	
	public void DFS(int L) {
		if(L == m) {
			for(int i = 0; i < m; i++) {
				for(int j = 0; j < i; j++) {
					if(pm[i] == pm[j]) return;
				}
			}
			for(int x : pm) System.out.print(x + " ");
			System.out.println();
		} else {
			for(int i = 0; i < n; i++) {
				ch[L] = 1;
				pm[L] = arr[i];
				DFS(L+1);
				ch[L] = 0;
			}
		}
	}
	
	public static void main(String[] args) {
		Ex08_06_M T = new Ex08_06_M();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		arr = new int[n];
		ch = new int[n];
		pm = new int[m];
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		T.DFS(0);
	}
}
 