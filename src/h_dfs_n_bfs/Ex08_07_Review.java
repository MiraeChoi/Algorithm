package h_dfs_n_bfs;

import java.util.Scanner;

class Ex08_07_Review {
	int dy[][] = new int[35][35];
	
	public int DFS(int n, int r) {
		if(dy[n][r] > 0) return dy[n][r];
		if(r == 0 || r == n) return 1;
		if(r == 1) return dy[n][r] = n;
		else return dy[n][r] = DFS(n-1, r-1) + DFS(n-1, r);
	}
	
	public static void main(String[] args) {
		Ex08_07_Review T = new Ex08_07_Review();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int r = kb.nextInt();
		System.out.println(T.DFS(n, r));
	}
}
