package h_dfs_n_bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point {
	public int x, y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Ex08_11_T {
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int[][] board, dis;
	
	public void BFS(int x, int y) {
		Queue<Point> Q = new LinkedList<>();
		Q.offer(new Point(x, y));
		board[x][y] = 1;
		int cnt = 0;
		
		while(!Q.isEmpty()) {
			Point tmp = Q.poll();
			for(int i = 0; i < 4; i++) {
				int nx = tmp.x + dx[i];
				int ny = tmp.y + dy[i];
				
				if(nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && board[nx][ny] == 0) {
					board[nx][ny] = 1;
					Q.offer(new Point(nx, ny));
					dis[nx][ny] = dis[tmp.x][tmp.y] + 1;
					System.out.println("dis[" + nx + "][" + ny + "] : " + dis[nx][ny]);
				}
			}
			cnt++;
			System.out.println(cnt + "번째 도는 중 ...");
		}
	}
	
	public static void main(String[] args) {
		Ex08_11_T T = new Ex08_11_T();
		Scanner kb = new Scanner(System.in);
		board = new int[7+1][7+1];
		dis = new int[7+1][7+1];
		for(int i = 1; i <= 7; i++) {
			for(int j = 1; j <= 7; j++) {
				board[i][j] = kb.nextInt();
			}
		}
		T.BFS(1, 1);
		if(dis[7][7] == 0) System.out.println(-1);
		else System.out.println(dis[7][7]);
		for(int i = 1; i <= 7; i++) {
			for(int j = 1; j <= 7; j++) {
				System.out.print(dis[i][j] + " ");
			}
			System.out.println();
		}
	}
}
