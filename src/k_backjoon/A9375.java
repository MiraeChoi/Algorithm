package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A9375 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcase = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < testcase; i++) {
			int n = Integer.parseInt(br.readLine());
			String[] wear = new String[n];
			int answer = 0;
			for(int j = 0; j < n; j++) {
				wear[j] = br.readLine();
				
			}
			sb.append(answer).append('\n');
		}
		System.out.println(sb);
	}
}
