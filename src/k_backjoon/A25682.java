package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A25682 {
	//맞았습니다!!
	private static int N, M, K;
	private static int[][] chess;
	
	private static int board(int BorW) {
		int answer = Integer.MAX_VALUE;
		int[][] sum = new int[N + 1][M + 1];
		int tmp;
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				if((i + j) % 2 == 0) tmp = chess[i][j] != BorW? 1 : 0;
				else tmp = chess[i][j] == BorW? 1 : 0;
				sum[i + 1][j + 1] = sum[i][j + 1] + sum[i + 1][j] - sum[i][j] + tmp;
			}
		}
		for(int i = 1; i <= N - K + 1; i++) {
			for(int j = 1; j <= M - K + 1; j++) {
				answer = Math.min(answer, 
					sum[i + K - 1][j + K - 1] - sum[i + K - 1][j - 1] - sum[i - 1][j + K - 1] + sum[i - 1][j - 1]);
			}
		}
		return answer;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		chess = new int[N][M];
		for(int i = 0; i < N; i++) {
			String str = br.readLine();
			for(int j = 0; j < M; j++) {
				if(str.charAt(j) == 'B') chess[i][j] = 1;
				else chess[i][j] = 0;
			}
		}
		System.out.print(Math.min(board(1), board(0)));
	}
}