package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A2563 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int[][] paper = new int[101][101];
		int T = Integer.parseInt(br.readLine());
		int answer = 0;
		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			for(int j = x; j < 10 + x; j++) {
				for(int k = y; k < 10 + y; k++) {
					paper[j][k] = 1;
				}
			}
		}
		for(int i = 1; i <= 100; i++) {
			for(int j = 1; j <= 100; j++) {
				if(paper[i][j] == 1) answer++;
			}
		}
		System.out.println(answer);
	}
}