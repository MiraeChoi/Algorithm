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
