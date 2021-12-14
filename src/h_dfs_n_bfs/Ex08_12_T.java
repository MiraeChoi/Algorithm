package h_dfs_n_bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class PointT {
	int x, y;
	
	public PointT(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Ex08_12_T {
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int n, m;
	static int[][] board, dis;
	static Queue<PointT> Q = new LinkedList<>();
	
	public void BFS() {
		while(!Q.isEmpty()) {
			PointT tmp = Q.poll();
			for(int i = 0; i < 4; i++) {
				int nx = tmp.x + dx[i];
				int ny = tmp.y + dy[i];
				
				if(nx >= 0 && nx < n && ny >= 0 && ny < m && board[nx][ny] == 0) {
					board[nx][ny] = 1;
					Q.offer(new PointT(nx, ny));
					dis[nx][ny] = dis[tmp.x][tmp.y] + 1;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Ex08_12_T T = new Ex08_12_T();
		Scanner kb = new Scanner(System.in);
		m = kb.nextInt();
		n = kb.nextInt();
		board = new int[n][m];
		dis = new int[n][m];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				board[i][j] = kb.nextInt();
				if(board[i][j] == 1) Q.offer(new PointT(i, j));
			}
		}
		T.BFS();
		boolean flag = true;
		int answer = Integer.MIN_VALUE;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(board[i][j] == 0) flag = false;
			}
		}
		if(flag) {
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < m; j++) {
					answer = Math.max(answer, dis[i][j]);
				}
			}
			System.out.println(answer);
		} else System.out.println(-1);
	}
}
