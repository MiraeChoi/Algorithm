package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A1912_3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
		int[] a = new int[n];
		int[] b = new int[n];
		a[0] = arr[0]; b[0] = -1001;
		for(int i = 1; i < n; i++) {
			a[i] = a[i-1] > 0 ? a[i-1] + arr[i] : arr[i];
			b[i] = Math.max(a[i-1], b[i-1]);
		}
//		for(int i = 0; i < n; i++) {
//			System.out.println(a[i] + " / " + b[i]);
//		}
		System.out.println(Math.max(a[n-1], b[n-1]));
	}
}