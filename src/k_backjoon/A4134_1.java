package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A4134_1 {
	//런타임 에러(NumberFormat)
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		long[] arr = new long[T];
		long max = Long.MIN_VALUE;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Long.parseLong(br.readLine());
			max = Math.max(max, arr[i]);
		}
		boolean[] prime = new boolean[(int)max * 2 + 1];
		prime[0] = prime[1] = true;
		for(int i = 2; i < prime.length; i++) {
			if(prime[i]) continue;
			for(int j = i * i; j < prime.length; j = j + i) {
				prime[j] = true;
			}
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j = (int)arr[i]; j < prime.length; j++) {
				if(!prime[j]) {
					sb.append(j).append('\n');
					break;
				}
			}
		}
		System.out.println(sb);
	}
}