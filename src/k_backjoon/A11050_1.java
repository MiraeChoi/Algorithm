package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A11050_1 {
	static int[][] arr;
	
	public static int binomial(int n, int k) {
		if(k == 0 || n == k) return 1;
		if(arr[n][k] == 0) arr[n][k] = binomial(n-1, k-1) + binomial(n-1, k);
		return arr[n][k];
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		arr = new int[n+1][k+1];
		
		
		if(k == 0 || n == k) System.out.println(1);
		else if(k == 1) System.out.println(n);
		else {
			binomial(n, k);
			for(int i = 0; i < n; i++) {
				for(int j = 0; j <= Math.min(i, k); j++) {
					if(j == 0 || j == i) arr[i][j] = 1;
					else arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
				}
			}
			System.out.println(arr[n][k]);
		}
	}
}