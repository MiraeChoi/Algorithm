package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A9012_2 {
	private static boolean check(String str) {
		if(str.charAt(0) == ')' || str.charAt(str.length() - 1) == '(') return false;
		else {
			int cnt = 0;
			for(int i = 0; i < str.length(); i++) {
				if(str.charAt(i) == '(') cnt++;
				if(str.charAt(i) == ')') cnt--;
				if(cnt < 0) return false;
			}
			if(cnt != 0) return false;
		}
		return true;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		while(T-- > 0) {
			String tmp = br.readLine();
			if(check(tmp)) sb.append("YES").append("\n");
			else sb.append("NO").append("\n");
		}
		System.out.println(sb);
	}
}