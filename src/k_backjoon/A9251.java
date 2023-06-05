package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A9251 {
	//맞았습니다!!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1 = br.readLine();
		String s2 = br.readLine();
		int[][] dy = new int[s1.length() + 1][s2.length() + 1];
		for(int i = 1; i <= s1.length(); i++) {
			for(int j = 1; j <= s2.length(); j++) {
				if(s1.charAt(i - 1) == s2.charAt(j - 1)) dy[i][j] = dy[i - 1][j - 1] + 1;
				else dy[i][j] = Math.max(dy[i - 1][j], dy[i][j - 1]);
			}
		}
		System.out.println(dy[s1.length()][s2.length()]);
	}
}