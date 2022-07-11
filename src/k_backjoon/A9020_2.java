package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A9020_2 {
	//맞았습니다!!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			max = Math.max(max, arr[i]);
		}
		boolean[] prime = new boolean[max + 1];
		prime[0] = prime[1] = true;
		for(int i = 2; i <= max; i++) {
			if(prime[i] == false) {
				for(int j = i * 2; j <= max; j += i) {
					prime[j] = true;
				}
			}
		}
		for(int i = 0; i < n; i++) {
			int idx = arr[i] / 2;
			if(!prime[idx]) sb.append(idx + " " + idx + "\n");
			else {
				int n1 = idx - 1;
				int n2 = idx + 1;
				while(true) {
					while(prime[n1]) n1--;
					while(prime[n2]) n2++;
					if(n1 < 2 || n2 > max) break;
					if(n1 + n2 == arr[i]) {
						sb.append(n1 + " " + n2 + "\n");
						break;
					} else if(n1 + n2 > arr[i]) {
						n1--;
					} else n2++;
				}
			}
		}
		System.out.println(sb);
	}
}
