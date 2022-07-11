package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A9020_3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		boolean[] prime = new boolean[10001];
		prime[0] = prime[1] = true;
		
		for(int i = 2; i <= Math.sqrt(prime.length - 1); i++) {
			if(prime[i]) continue;
			for(int j = i * 2; j < prime.length; j += i) prime[j] = true;
		}
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());
			int mid = num / 2;
			while(true) {
				if(!prime[mid] && !prime[num-mid]) {
					sb.append(mid).append(" ").append(num - mid).append("\n");
					break;
				}
				mid--;
			}
		}
		System.out.println(sb);
	}
}
