package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A4948_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		boolean[] prime = new boolean[123456 * 2 + 1];
		prime[0] = prime[1] = true;
		for(int i = 2; i < prime.length; i++) {
			if(!prime[i]) {
				for(int j = i + i; j < prime.length; j += i) {
					prime[j] = true;
				}
			}
		}
		
		while(true) {
			int n = Integer.parseInt(br.readLine());
			if(n == 0) break;
			int n2 = n * 2;
			int cnt = 0;
			
			for(int i = n + 1; i <= n2; i++) {
				if(!prime[i]) cnt++;
			}
			sb.append(cnt).append("\n");
		}
		System.out.println(sb);
	}
}
