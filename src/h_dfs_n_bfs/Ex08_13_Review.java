package h_dfs_n_bfs;

import java.util.Scanner;

class Ex08_13_Review {
	static int n, answer = 0;
	static int[] dx = {-1, 0, 1, 0, -1, 1, 1, -1};
	static int[] dy = {0, 1, 0, -1, 1, -1, 1, -1};
	static int[][] board;
	
	public void DFS(int x, int y) {
		for(int i = 0; i < 8; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 1) {
				board[nx][ny] = 0;
				DFS(nx, ny);
			}
		}
	}
	
	public void solution() {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(board[i][j] == 1) {
					answer++;
					DFS(i, j);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Ex08_13_Review T = new Ex08_13_Review();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		board = new int[n][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				board[i][j] = kb.nextInt();
			}
		}
		T.solution();
		System.out.println(answer);
	}
}
