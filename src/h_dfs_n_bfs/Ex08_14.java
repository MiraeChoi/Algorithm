package h_dfs_n_bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point14 {
	int x, y;
	
	public Point14(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Ex08_14 {
	static int[] dx = {-1, 0, 1, 0, -1, 1, 1, -1};
	static int[] dy = {0, 1, 0, -1, 1, -1, 1, -1};
	static int n, cnt = 1;
	static int[][] board, dis;
	static Queue<Point14> Q = new LinkedList<>();
	
	public void BFS(int x, int y) {
		while(!Q.isEmpty()) {
			while(!Q.isEmpty()) {
				Point14 tmp = Q.poll();
				
				for(int i = 0; i < 8; i++) {
					int nx = tmp.x + dx[i];
					int ny = tmp.y + dy[i];
					
					if(nx >= 0 && nx < n && ny >= 0 && ny < n) {
						if(board[nx][ny] == 1) {
							board[nx][ny] = 0;
							Q.offer(new Point14(nx, ny));
							dis[nx][ny] = cnt;
						}
					}
				}
			}
			cnt++;
			outer : for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					if(board[i][j] == 1) {
						board[i][j] = 0;
						Q.offer(new Point14(i, j));
						dis[i][j] = cnt;
						break outer;
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Ex08_14 T = new Ex08_14();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		board = new int[n][n];
		dis = new int[n][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				board[i][j] = kb.nextInt();
			}
		}
		outer : for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(board[i][j] == 1) {
					board[i][j] = 0;
					Q.offer(new Point14(i, j));
					dis[i][j] = 1;
					T.BFS(i, j);
					break outer;
				}
			}
		}
		int answer = Integer.MIN_VALUE;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				answer = Math.max(answer, dis[i][j]);
			}
		}
		System.out.println(answer);
	}
}
