package h_dfs_n_bfs;

import java.util.Scanner;

class Ex08_13_Review {
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
	static int n, answer = 0;
	static int[] dx = {-1, 0, 1, 0, -1, 1, 1, -1};
	static int[] dy = {0, 1, 0, -1, 1, -1, 1, -1};
	static int[][] board;
	
	public void DFS(int x, int y) {		//x = 0, y = 0
		for(int i = 0; i < 8; i++) {	//i = 0					i = 1
			int nx = x + dx[i];			//nx = 0 + (-1) = -1	nx = 0 + 0 = 0
			int ny = y + dy[i];			//ny = 0 + 0 = 0		ny = 0 + 1 = 1
			
			if(nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 1) {
				board[nx][ny] = 0;								//board[0][1] = 0
				DFS(nx, ny);									//DFS(0, 1)
			}
		}
	}
	
	public void solution() {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(board[i][j] == 1) {	//board[0][0] = 1
					answer++;			//answer = 1
					DFS(i, j);			//DFS(0, 0)
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Ex08_13_Review T = new Ex08_13_Review();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		board = new int[n][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				board[i][j] = kb.nextInt();
			}
		}
		T.solution();
		System.out.println(answer);
	}
}
