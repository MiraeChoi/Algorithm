package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A10844 {
	private static long mod = 1000000000;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long[][] dy = new long[N + 1][10];
		for(int i = 1; i < 10; i++) dy[1][i] = 1; 
		for(int i = 2; i <= N; i++) {
			for(int j = 0; j < 10; j++) {
				if(j == 0) dy[i][0] = dy[i - 1][1] % mod;
				else if(j == 9) dy[i][9] = dy[i - 1][8] % mod;
				else dy[i][j] = (dy[i - 1][j - 1] + dy[i - 1][j + 1]) % mod;
			}
		}
		long answer = 0;
		for(int i = 0; i < 10; i++) answer += dy[N][i];
		System.out.println(answer % mod);
	}
}