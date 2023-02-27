package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A2501 {
	//맞았습니다!!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int cnt = 0;
		for(int i = 1; i <= N; i++) {
			System.out.println("N : " + N + " % " + i + " = " + (N % i));
			if(N % i == 0) cnt++;
			if(cnt == K) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(0);
	}
}