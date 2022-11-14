package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A11050_2 {
	//dynamic programming
	static int[][] arr;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		arr = new int[N+1][K+1];
		System.out.println(BC(N, K));
	}
	
	static int BC(int n, int k) {
		if(arr[n][k] > 0) return arr[n][k];
		if(k == 0 || n == k) return arr[n][k] = 1;
		return arr[n][k] = BC(n-1, k-1) + BC(n-1, k);
	}
}