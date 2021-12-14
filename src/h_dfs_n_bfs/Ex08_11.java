package h_dfs_n_bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Ex08_11 {
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int[][] board;
	static int answer = Integer.MAX_VALUE;
	int cnt = 0;
	
	public void BFS(int x, int y) {
		Queue<Integer> Qx = new LinkedList<>();
		Queue<Integer> Qy = new LinkedList<>();
		Qx.offer(1);
		Qy.offer(1);
		int[][] ch = new int[7+1][7+1];
		
		while(!Qx.isEmpty() && !Qy.isEmpty()) {
			int nx = Qx.poll();
			int ny = Qy.poll();
			System.out.println("nx/ny : " + nx + "/" + ny);
			
			if(nx == 7 && ny == 7) {
				System.out.println("«œ¿Ãø∞ : " + cnt);
				if(cnt < answer) {
					answer = cnt;
					System.out.println("answer : " + answer);
				}
				cnt = 0;
				for(int i = 1; i <= 7; i++) {
					for(int j = 1; j <= 7; j++) {
						ch[i][j] = 0;
					}
				}
			}
			
			for(int i = 0; i < dx.length; i++) {
				int cx = nx + dx[i];
				int cy = ny + dy[i];
				
				if(cx >= 1 && cx <= 7 && cy >= 1 && cy <= 7 && board[cx][cy] == 0 && ch[cx][cy] == 0) {
					ch[cx][cy] = 1;
					Qx.offer(cx);
					Qy.offer(cy);
					cnt++;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Ex08_11 T = new Ex08_11();
		Scanner kb = new Scanner(System.in);
		board = new int[7+1][7+1];
		for(int i = 1; i <= 7; i++) {
			for(int j = 1; j <= 7; j++) {
				board[i][j] = kb.nextInt();
			}
		}
		board[1][1] = 1;
		T.BFS(1, 1);
		if(answer == Integer.MAX_VALUE) System.out.println(-1);
		else System.out.println(answer);
	}
}
