package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A10812 {
	//맞았습니다!!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] basket = new int[N + 1];
		for(int i = 1; i <= N; i++) basket[i] = i;
		while(M-- > 0) {
			st = new StringTokenizer(br.readLine());
			int begin = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int mid = Integer.parseInt(st.nextToken());
			for(int i = begin; i < mid; i++) {
				int tmp = basket[begin];
				for(int j = begin; j < end; j++) basket[j] = basket[j + 1];
				basket[end] = tmp;
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= N; i++) sb.append(basket[i]).append(' ');
		System.out.println(sb);
	}
}