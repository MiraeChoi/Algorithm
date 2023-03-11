package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

class A4134_2 {
	//맞았습니다!!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < T; i++) {
			long n = Long.parseLong(br.readLine());
			BigInteger answer = new BigInteger(String.valueOf(n));
			if(answer.isProbablePrime(10)) sb.append(answer).append('\n');
			else sb.append(answer.nextProbablePrime()).append('\n');
		}
		System.out.print(sb);
	}
}