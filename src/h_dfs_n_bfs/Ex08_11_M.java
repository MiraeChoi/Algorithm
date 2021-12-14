package h_dfs_n_bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Ex08_11_M {
	static int[][] board;
	static int[][] dis;
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	
	public void BFS(int x, int y) {
		Queue<Integer> Qx = new LinkedList<>();
		Queue<Integer> Qy = new LinkedList<>();
		Qx.offer(x);
		Qy.offer(y);
		
		while(!Qx.isEmpty() && !Qy.isEmpty()) {
			int cx = Qx.poll();
			int cy = Qy.poll();
			
			if(cx == 7 && cy == 7) {
				return;
			}
			
			for(int i = 0; i < dx.length; i++) {
				int nx = cx + dx[i];
				int ny = cy + dy[i];
				if(nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && board[nx][ny] == 0) {
					board[nx][ny] = 1;
					dis[nx][ny] = dis[cx][cy] + 1;
					Qx.offer(nx);
					Qy.offer(ny);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Ex08_11_M T = new Ex08_11_M();
		Scanner kb = new Scanner(System.in);
		board = new int[7+1][7+1];
		dis = new int[7+1][7+1];
		for(int i = 1; i <= 7; i++) {
			for(int j = 1; j <= 7; j++) {
				board[i][j] = kb.nextInt();
			}
		}
		board[1][1] = 1;
		T.BFS(1, 1);
		if(dis[7][7] != 0) System.out.println(dis[7][7]);
		else System.out.println(-1);
		for(int i = 1; i <= 7; i++) {
			for(int j = 1; j <= 7; j++) {
				System.out.print(dis[i][j] + " ");
			}
			System.out.println();
		}
	}
}
