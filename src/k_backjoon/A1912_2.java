package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A1912_2 {
	//맞았습니다!!
	private static int answer = Integer.MIN_VALUE;
	private static int[] arr;
	private static Integer[] dp;
	
	private static int recur(int n) {
		if(dp[n] == null) {
			dp[n] = Math.max(recur(n-1) + arr[n], arr[n]);
			answer = Math.max(answer, dp[n]);
		}
		return dp[n];
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		arr = new int[n];
		dp = new Integer[n];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
		dp[0] = arr[0];
		answer = arr[0];
		recur(n-1);
		System.out.println(answer);
	}
}