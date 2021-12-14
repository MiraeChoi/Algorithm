package h_dfs_n_bfs;

import java.util.Scanner;

class Ex08_09_M {
	static int n, m;
	static int[] combi;
	
	public void DFS(int L, int sum) {
		if(L == m) {
			for(int x : combi) System.out.print(x + " ");
			System.out.println();
		} else {
			for(int i = 1; i <= n; i++) {
				if(i > L) {
					combi[L] = i;
					DFS(L+1, sum+i);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Ex08_09_M T = new Ex08_09_M();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		combi = new int[m];
		T.DFS(0, 1);
	}
}
