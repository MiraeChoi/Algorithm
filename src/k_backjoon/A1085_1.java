package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A1085_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		int answer = 0;
		answer = Math.min(Math.abs(x-w), Math.abs(x-0));
		answer = Math.min(answer, Math.abs(y-h));
		answer = Math.min(answer, Math.abs(y-0));
		System.out.println(answer);
	}
}
