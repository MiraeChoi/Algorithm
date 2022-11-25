package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A11051_1 {
	//Æ²·È½À´Ï´Ù
	static double[][] arr;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		double N = Double.parseDouble(st.nextToken());
		double K = Double.parseDouble(st.nextToken());
		arr = new double[(int)N+1][(int)K+1];
		System.out.println(BC((int)N, (int)K) % 10007);
	}
	
	static double BC(int n, int k) {
		if(arr[n][k] > 0) return arr[n][k];
		if(k == 0 || n == k) return arr[n][k] = 1;
		return arr[n][k] = BC(n-1, k-1) + BC(n-1, k);
	}
}