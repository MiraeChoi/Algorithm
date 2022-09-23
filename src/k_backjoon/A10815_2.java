package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A10815_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			max = Math.max(max, arr[i]);
		}
		int[] cnt = new int[max + 10000001];
		for(int i = 0; i < n; i++) cnt[arr[i] + 10000000]++;
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < m; i++) {
			int tmp = Integer.parseInt(st.nextToken()) + 10000000;
			if(tmp > cnt.length) sb.append(0).append(' ');
			else sb.append(cnt[tmp]).append(' ');
		}
		System.out.println(sb);
	}
}
