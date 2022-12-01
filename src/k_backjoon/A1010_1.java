package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A1010_1 {
	private static int factorial(int n) {
		int answer = 1;
		for(int i = n; i >= 2; i--) answer *= i;
		return answer;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			if(N == M) sb.append(1).append('\n');
			else if(N == 1) sb.append(M).append('\n');
			else if(M == 1) sb.append(N).append('\n');
			else sb.append(factorial(M - N - 5) * 2).append('\n');
		}
		System.out.println(sb);
	}
}