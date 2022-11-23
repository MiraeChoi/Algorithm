package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

class A1676_1 {
	//맞았습니다!!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int answer = 0;
		if(N >= 5) {
			BigInteger big = new BigInteger(N + "");
			BigInteger num = null;
			for(int i = N-1; i >= 2; i--) {
				num = new BigInteger(i + "");
				big = big.multiply(num);
			}
			String str = big + "";
			if(str.charAt(str.length() - 1) == '0') {
				for(int i = str.length() - 2; i >= 0; i--) {
					answer++;
					if(str.charAt(i) != '0') break;
				}
			}
		}
		System.out.println(answer);
	}
}