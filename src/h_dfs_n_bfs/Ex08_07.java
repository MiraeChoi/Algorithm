package h_dfs_n_bfs;

import java.util.Scanner;

class Ex08_07 {
	public int DFS(int n, int r) {
		if(n == 1) return 1;
		if(r == 1) return n;
		if(r == n) return 1;
		else return DFS(n-1, r-1) + DFS(n-1, r);
	}
	
	public static void main(String[] args) {
		Ex08_07 T = new Ex08_07();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int r = kb.nextInt();
		System.out.println(T.DFS(n, r));
	}
}
