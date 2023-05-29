package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A12865 {
	//맞았습니다!!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[][] bag = new int[N + 1][2];
		for(int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			bag[i][0] = Integer.parseInt(st.nextToken());
			bag[i][1] = Integer.parseInt(st.nextToken());
		}
		int[][] dy = new int[N + 1][K + 1];
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= K; j++) {
				if(bag[i][0] > j) dy[i][j] = dy[i - 1][j];
				else dy[i][j] = Math.max(dy[i - 1][j], dy[i - 1][j - bag[i][0]] + bag[i][1]);
			}
		}
//		for(int i = 1; i <= N; i++) {
//			for(int j = 1; j <= K; j++) {
//				System.out.print(dy[i][j] + " ");
//			}
//			System.out.println();
//		}
		System.out.println(dy[N][K]);
	}
}