package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A5086 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st;
		int x, y;
		StringBuilder sb = new StringBuilder();
		while(true) {
			String[] s = br.readLine().split(" ");
			x = Integer.parseInt(s[0]);
			y = Integer.parseInt(s[1]);
//			st = new StringTokenizer(br.readLine(), " ");
//			x = Integer.parseInt(st.nextToken());
//			y = Integer.parseInt(st.nextToken());
			if(x == 0 && y == 0) break;
			else {
				if(x < y && y % x == 0) sb.append("factor").append("\n");
				else if(x > y && x % y == 0) sb.append("multiple").append("\n");
				else sb.append("neither").append("\n");
			}
		}
		System.out.println(sb);
	}
}