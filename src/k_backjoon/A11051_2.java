package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A11051_2 {
	//맞았습니다!!
	public static int[][] arr;
	
	private static int BC(int N, int K) {
		if(arr[N][K] > 0) return arr[N][K];
		if(K == 0 || N == K) return arr[N][K] = 1;
		return arr[N][K] = (BC(N-1, K-1) + BC(N-1, K)) % 10007;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		arr = new int[N+1][K+1];
		System.out.println(BC(N, K));
	}
}