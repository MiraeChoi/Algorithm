package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A1002_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int r1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int r2 = Integer.parseInt(st.nextToken());
			
			if(x1 == x2 && y1 == y2 && r1 == r2) sb.append(-1).append('\n');
			else if(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) > Math.pow(r1 + r2, 2)
					|| Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) < Math.pow(r2 - r1, 2)) sb.append(0).append('\n');
			else if(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) == Math.pow(r2 - r1, 2)
					|| Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) == Math.pow(r1 + r2, 2)) sb.append(1).append('\n');
			else sb.append(2).append('\n');
		}
		System.out.println(sb);
	}
}