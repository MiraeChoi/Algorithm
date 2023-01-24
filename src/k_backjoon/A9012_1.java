package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A9012_1 {
	//맞았습니다!!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		out : while(T-- > 0) {
			String tmp = br.readLine();
			if(tmp.charAt(0) == ')' || tmp.charAt(tmp.length() - 1) == '(') {
				sb.append("NO").append("\n");
				continue;
			} else {
				int cnt = 0;
				for(int i = 0; i < tmp.length(); i++) {
					if(tmp.charAt(i) == '(') cnt++;
					if(tmp.charAt(i) == ')') cnt--;
					if(cnt < 0) {
						sb.append("NO").append("\n");
						continue out;
					}
				}
				if(cnt == 0) sb.append("YES").append("\n");
				else sb.append("NO").append("\n");
			}
		}
		System.out.println(sb);
	}
}