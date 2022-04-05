package h_dfs_n_bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Ex08_11 {
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
				System.out.println("하이염 : " + cnt);
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
