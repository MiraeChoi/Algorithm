package h_dfs_n_bfs;

import java.util.Scanner;

class Ex08_09_Review {
	static int n, m;
	static int[] combi;
	
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
		Ex08_09_Review T = new Ex08_09_Review();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		combi = new int[m];
		T.DFS(0, 1);
	}
}
