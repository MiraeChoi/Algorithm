package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A4134_3 {
	private static boolean isPrime(long n) {
		if(n <= 1) return false;
		for(long i = 2; i * i <= n; i++) {
			if(n % i == 0) return false;
		}
		return true;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		while(T-- > 0) {
			long n = Long.parseLong(br.readLine());
			while(!isPrime(n)) n++;
			sb.append(n).append('\n');
		}
		System.out.print(sb);
	}
}