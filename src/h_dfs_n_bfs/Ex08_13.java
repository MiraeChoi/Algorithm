package h_dfs_n_bfs;

import java.util.Scanner;

class Ex08_13 {
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
	static int n, island, cnt = 0;
	static int[][] map, dis;
	
	public void DFS(int x, int y) {
		System.out.println(x + "/" + y);
		if(cnt == n) {
			System.out.println("아일랜드");
			island++;
			cnt = 0;
			
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					if(map[i][j] == 1) {
						map[i][j] = 0;
						dis[i][j] = island + 1;
						DFS(i, j);
					}
				}
			}
		} else {
			for(int i = 0; i < 8; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				
				if(nx >= 0 && nx < n && ny >= 0 && ny < n) {
					if(map[nx][ny] == 1) {
						map[nx][ny] = 0;
						dis[nx][ny] = island + 1;
						DFS(nx, ny);
					} else cnt++;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Ex08_13 T = new Ex08_13();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		map = new int[n][n];
		dis = new int[n][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				map[i][j] = kb.nextInt();
			}
		}
		T.DFS(0, 0);
		System.out.println(island);
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(dis[i][j] + " ");
				
			}
			System.out.println();
		}
	}
}
