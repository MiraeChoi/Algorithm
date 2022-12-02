package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A1010_2 {
	private static int nCr(int n, int r){
		if(r * 2 > n) r = n - r;
		int[] arr = new int[r+1];
		for(int m = 0; m <= r; m++) {
			for(int k = m-1; k > 0; k--) {
				arr[k] += arr[k-1];
			}
			arr[m] = 1;
		}
		for(int i = 0; i < arr.length; i++) System.out.println(arr[i] + "/");
		System.out.println("---------------------------");
		for(int m = r+1; m <= n; m++) {
			for(int k = r; k > 0; k--) {
				arr[k] += arr[k-1];
			}
		}
		for(int i = 0; i < arr.length; i++) System.out.println(arr[i] + "/");
		return arr[r];
	}
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		while(T-- > 0) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			sb.append(nCr(m, n) + "\n");
		}
		System.out.println(sb);
	}
}