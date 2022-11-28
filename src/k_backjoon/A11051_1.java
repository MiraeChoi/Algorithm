package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A11051_1 {
	//Æ²·È½À´Ï´Ù
	//¹Ý·Ê : 1000 259
	static int[][] arr;
	
	static int BC(int n, int k) {
		if(arr[n][k] > 0) return arr[n][k];
		else if(k == 0 || n == k) return arr[n][k] = 1;
		else if(k == 1) return arr[n][k] = n;
		return arr[n][k] = BC(n-1, k-1) + BC(n-1, k);
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		arr = new int[N+1][K+1];
		System.out.println(BC(N, K) % 10007);
	}
}