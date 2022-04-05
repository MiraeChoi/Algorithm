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
	//설명
	//N*N의 섬나라 아일랜드의 지도가 격자판의 정보로 주어집니다.
	//각 섬은 1로 표시되어 상하좌우와 대각선으로 연결되어 있으며, 0은 바다입니다.
	//섬나라 아일랜드에 몇 개의 섬이 있는지 구하는 프로그램을 작성하세요.
	//1 1 0 0 0 1 0
	//0 1 1 0 1 1 0
	//0 1 0 0 0 0 0
	//0 0 0 1 0 1 1
	//1 1 0 1 1 0 0
	//1 0 0 0 1 0 0
	//1 0 1 0 1 0 0
	//만약 위와 같다면 섬의 개수는 5개입니다.
	
	//입력
	//첫 번째 줄에 자연수 N(3<=N<=20)이 주어집니다.
	//두 번째 줄부터 격자판 정보가 주어진다.
	
	//출력
	//첫 번째 줄에 섬의 개수를 출력한다.
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
