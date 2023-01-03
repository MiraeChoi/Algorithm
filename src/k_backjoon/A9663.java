package k_backjoon;

import java.io.IOException;

class A9663 {
	static int N, answer = 0;
	static int[][] chess;
	
	private static void arr(int x, int y) {
		for(int i = x-1; i >= 0; i--) if(chess[i][y] == 0) chess[i][y] = 2;
		for(int i = x+1; i < N; i++) if(chess[i][y] == 0) chess[i][y] = 2;
		for(int j = y-1; j >= 0; j--) if(chess[x][j] == 0) chess[x][j] = 2;
		for(int j = y+1; j < N; j++) if(chess[x][j] == 0) chess[x][j] = 2;
		for(int i = x-1, j = y-1; i >= 0 && j >= 0; i--, j--) if(chess[i][j] == 0) chess[i][j] = 2;
		for(int i = x+1, j = y+1; i < N && j < N; i++, j++) if(chess[i][j] == 0) chess[i][j] = 2;
		for(int i = x-1, j = y+1; i >= 0 && j < N; i--, j++) if(chess[i][j] == 0) chess[i][j] = 2;
		for(int i = x+1, j = y-1; i < N && j >= 0; i++, j--) if(chess[i][j] == 0) chess[i][j] = 2;
	}
	
	private static void queen(int n) {
		for(int i = n; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(chess[i][j] == 0) {
					chess[i][j] = 1;
					arr(i, j);
					break;
				}
			}
			for(int j = 0; j < N; j++) {
				for(int k = 0; k < N; k++) {
					System.out.print(chess[j][k] + " ");
				}
				System.out.println();
			}
			System.out.println("------------------");
		}
	}
	
	public static void main(String[] args) throws IOException {
		N = readInt();
		chess = new int[N][N];
		for(int i = 0; i < N; i++) {
			queen(i);
			System.out.println("¡Ú");
		}
		System.out.println(answer);
	}
	
	private static int readInt() throws IOException {
		int n = 0;
		while(true) {
			int input = System.in.read();
			if(input <= 32) return n;
			else n = (n << 3) + (n << 1) + (input & 15);
		}
	}
}