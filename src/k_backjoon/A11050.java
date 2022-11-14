package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A11050 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		if(k == 0) System.out.println(0);
		else if(k == 1) System.out.println(n);
		else if(k == n) System.out.println(1);
		else {
			int[][] arr = new int[10][10];
			int r = 0;
			for(int i = 0; i < n; i++) {
				for(int j = 0; j <= Math.min(i, r); j++) {
					if(j == 0 || j == i) arr[i][j] = 1;
					else arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
				}
			}
			System.out.println(arr[n][r]);
		}
	}
}
