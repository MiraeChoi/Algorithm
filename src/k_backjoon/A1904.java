package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A1904 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int answer = 0;
		for(int i = 0; i <= Integer.MAX_VALUE; i++) {
			String str = Integer.toBinaryString(i);
			if(str.length() > N) break;
			if(str.length() < N) {
				int len = N - str.length();
				str = "";
				while(len-- > 0) str += "0";
				str += Integer.toBinaryString(i);
			}
			int cnt = 0;
			boolean zero = true;
			for(int j = 0; j < str.length(); j++) {
				if(str.charAt(j) == '0') {
					cnt++;
					zero = false;
					if(j == str.length() - 1) break;
					if(str.charAt(j + 1) == '0') {
						cnt++;
						zero = true;
					}
				}
			}
			if(cnt % 2 == 0 && zero) {
				System.out.println("str : " + str + " & " + cnt);
				answer++;
			}
		}
		System.out.println(answer);
	}
}