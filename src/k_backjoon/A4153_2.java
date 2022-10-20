package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A4153_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		while(true) {
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			if(a == 0 && b == 0 && c == 0) break;
			else {
				if(c * c == a * a + b * b) sb.append("right").append('\n');
				else if(b * b == a * a + c * c) sb.append("right").append('\n');
				else if(a * a == b * b + c * c) sb.append("right").append('\n');
				else sb.append("wrong").append('\n');
			}
			st = new StringTokenizer(br.readLine());
		}
		System.out.println(sb);
	}
}