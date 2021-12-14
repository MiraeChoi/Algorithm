package h_dfs_n_bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point14R {
	int x, y;
	
	public Point14R(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Ex08_14_Review {
	static int n, answer;
	static int[] dx = {-1, 0, 1, 0, -1, 1, 1, -1};
	static int[] dy = {0, 1, 0, -1, -1, 1, -1, 1};
	static Queue<Point14R> Q = new LinkedList<>();
	
	public void BFS(int x, int y, int[][] board) {
		while(!Q.isEmpty()) {
			Point14R tmp = Q.poll();
			
			for(int i = 0; i < 8; i++) {
				int nx = tmp.x + dx[i];
				int ny = tmp.y + dy[i];
				
				if(nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 1) {
					board[nx][ny] = 0;
					Q.offer(new Point14R(nx, ny));
				}
			}
		}
	}
	
	public void solution(int[][] board) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(board[i][j] == 1) {
					answer++;
					Q.offer(new Point14R(i, j));
					BFS(i, j, board);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Ex08_14_Review T = new Ex08_14_Review();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		int[][] board = new int[n][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				board[i][j] = kb.nextInt();
			}
		}
		T.solution(board);
		System.out.println(answer);
	}
}
