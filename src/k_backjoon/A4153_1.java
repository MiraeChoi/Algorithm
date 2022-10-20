package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A4153_1 {
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
				int max = Math.max(a, Math.max(b, c));
				int a1, a2;
				if(a == max) {a1 = b; a2 = c;}
				else if(b == max) {a1 = a; a2 = c;}
				else {a1 = a; a2 = b;}
				
				if(max * max == a1 * a1 + a2 * a2) sb.append("right").append('\n');
				else sb.append("wrong").append('\n');
			}
			st = new StringTokenizer(br.readLine());
		}
		System.out.println(sb);
	}
}