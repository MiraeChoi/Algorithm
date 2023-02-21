package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A10811 {
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
			int b1 = Integer.parseInt(st.nextToken());
			int b2 = Integer.parseInt(st.nextToken());
			if(b2 - b1 > 0) {
				int idx = 0;
				while(b1 + idx < b2 - idx) {
					int tmp = basket[b1 + idx];
					basket[b1 + idx] = basket[b2 - idx];
					basket[b2 - idx] = tmp;
					idx++;
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= N; i++) sb.append(basket[i]).append(' ');
		System.out.println(sb);
	}
}