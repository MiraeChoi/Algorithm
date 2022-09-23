package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A10815_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] cnt = new int[20000001];
		for(int i = 0; i < n; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			cnt[tmp + 10000000]++;
		}
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < m; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			sb.append(cnt[tmp + 10000000]).append(' ');
		}
		System.out.println(sb);
	}
}