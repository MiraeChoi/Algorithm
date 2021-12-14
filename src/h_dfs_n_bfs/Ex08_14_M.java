package h_dfs_n_bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point14M {
	int x, y;
	
	public Point14M(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Ex08_14_M {
	static int n, answer = 0;
	static int[] dx = {-1, 0, 1, 0, -1, -1, 1, 1};
	static int[] dy = {0, 1, 0, -1, 1, -1, 1, -1};
	static int[][] board;
	static Queue<Point14M> Q = new LinkedList<>();
	
	public void BFS() {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(board[i][j] == 1) {
					board[i][j] = 0;
					Q.offer(new Point14M(i, j));
					
					while(!Q.isEmpty()) {
						Point14M tmp = Q.poll();
						
						for(int k = 0; k < 8; k++) {
							int nx = tmp.x + dx[k];
							int ny = tmp.y + dy[k];
							
							if(nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 1) {
								board[nx][ny] = 0;
								Q.offer(new Point14M(nx, ny));
							}
						}
					}
					answer++;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Ex08_14_M T = new Ex08_14_M();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		board = new int[n][n];
		int x = 0, y = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				board[i][j] = kb.nextInt();
			}
		}
		T.BFS();
		System.out.println(answer);
	}
}
