package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

class A2004_1 {
	//메모리 초과
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		BigInteger answer = new BigInteger(1 + "");
		for(int i = n; i > m; i--) {
			BigInteger idx = new BigInteger(i + "");
			answer = answer.multiply(idx);
		}
		for(int i = n - m; i > 1; i--) {
			BigInteger idx = new BigInteger(i + "");
			answer = answer.divide(idx);
		}
		String str = answer.toString();
		int cnt = 0;
		for(int i = str.length() - 1; i >= 0; i--) {
			if(str.charAt(i) != '0') break;
			else cnt++;
		}
		System.out.println(cnt);
	}
}