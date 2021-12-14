package h_dfs_n_bfs;

import java.util.Scanner;

class Ex08_15 {
	static int n, m, answer = 0;
	static int[][] board;
	
	public void DFS() {
		
	}
	
	public static void main(String[] args) {
		Ex08_15 T = new Ex08_15();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		board = new int[n+1][n+1];
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				board[i][j] = kb.nextInt();
			}
		}
		T.DFS();
		System.out.println(answer);
	}
}
