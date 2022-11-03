package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A1934_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		while(T-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int min = 0, max = 0;
			if(A == B) sb.append(A).append('\n');
			else {
				if(A > B) { min = B; max = A; }
				else 	  { min = A; max = B; }
				
				if(min == 1) sb.append(max).append('\n');
				else {
					int tmp = 1;
					int num = 2;
					while(true) {
						tmp = min * num;
						if(tmp % max == 0) {
							sb.append(tmp).append('\n');
							break;
						}
						num++;
					}
				}
			}
		}
		System.out.println(sb);
	}
}