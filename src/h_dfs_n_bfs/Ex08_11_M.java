package h_dfs_n_bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Ex08_11_M {
	//설명
	//7*7 격자판 미로를 탈출하는 최단경로의 길이를 출력하는 프로그램을 작성하세요.
	//경로의 길이는 출발점에서 도착점까지 가는 데 이동한 횟수를 의미한다.
	//출발점은 격자의 (1, 1) 좌표이고, 탈출 도착점은 (7, 7)좌표이다. 격자판의 1은 벽이고, 0은 도로이다.
	//격자판의 움직임은 상하좌우로만 움직인다. 미로가 다음과 같다면
	//출발 0 0 0 0 0  0
	// 0  1 1 1 1 1  0
	// 0  0 0 1 0 0  0
	// 1  1 0 1 0 1  1
	// 1  1 0 1 0 0  0
	// 1  0 0 0 1 0  0
	// 1  0 1 0 0 0 도착
	//위와 같은 경로가 최단 경로의 길이는 12이다.

	//입력
	//첫 번째 줄부터 7*7 격자의 정보가 주어집니다.
	
	//출력
	//첫 번째 줄에 최단으로 움직인 칸의 수를 출력한다. 도착할 수 없으면 -1를 출력한다.
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
