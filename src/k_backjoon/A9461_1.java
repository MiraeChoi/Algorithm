package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A9461_1 {
	//맞았습니다!!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		long[] dp = new long[101];
		dp[1] = dp[2] = dp[3] = 1;
		dp[4] = dp[5] = 2;
		StringBuilder sb = new StringBuilder();
		while(T-- > 0) {
			int N = Integer.parseInt(br.readLine());
			if(dp[N] == 0) {
				for(int i = 6; i <= N; i++) dp[i] = dp[i-1] + dp[i-5];
				for(int i = 1; i <= N; i++) {
					System.out.println("dp[" + i + "] : " + dp[i]);
				}
			}
			sb.append(dp[N]).append('\n');
		}
		System.out.println(sb);
	}
}