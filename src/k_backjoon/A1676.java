package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

class A1676 {
	//1 ~ 500!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long sum = 1;
		BigInteger big;
		for(int i = N; i >= 1; i--) {
//			big = new BigInteger((Integer.parseInt(big) * i) + "");
			sum *= i;
		}
		String str = sum + "";
		int answer = 0;
		System.out.println("sum : " + sum);
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '0') answer++;
		}
		System.out.println(answer);
	}
}