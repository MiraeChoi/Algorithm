package h_dfs_n_bfs;

import java.util.Scanner;

class Ex08_12 {
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int m, n;
	static int[][] box;
	static int day = 0;
	
	public void BFS() {
		int cnt = 1;
		
		while(cnt != 0) {
			cnt = 0;
			day++;
			
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < m; j++) {
					if(box[i][j] == 0) cnt++;
					if(box[i][j] == 1) {
						for(int k = 0; k < 4; k++) {
							int nx = i + dx[k];
							int ny = j + dy[k];
							
							if(nx >= 0 && nx < n && ny >= 0 && ny < m && box[nx][ny] == 0) {
								box[nx][ny] = 2;
							}
						}
					}
				}
			}
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < m; j++) {
					if(box[i][j] == 2) box[i][j] = 1;
					System.out.print(box[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println("------------------");
			
			cnt = 0;
			
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < m; j++) {
					if(box[i][j] == 0) {
						cnt++;
						break;
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Ex08_12 T = new Ex08_12();
		Scanner kb = new Scanner(System.in);
		m = kb.nextInt();
		n = kb.nextInt();
		box = new int[n][m];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				box[i][j] = kb.nextInt();
			}
		}
		T.BFS();
		System.out.println(day);
	}
}
