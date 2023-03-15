package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A17103_1 {
	//시간 초과
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean[] prime = new boolean[1000001];
		prime[0] = prime[1] = true;
        for(int i = 2; i <= 1000000; i++) {
        	if(!prime[i]) {
        		for(int j = i + i; j <= 1000000; j += i) {
        			prime[j] = true;
        		}
        	}
        }
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		while(T-- > 0) {
			int num = Integer.parseInt(br.readLine());
			int cnt = 0;
			for(int i = 2; i <= num / 2; i++) {
				if(prime[i]) continue;
				for(int j = 2; j < num; j++) {
					if(prime[j]) continue;
					if(i + j == num) {
//						System.out.println("i & j : " + i + " / " + j);
						cnt++;
						break;
					}
				}
			}
//			System.out.println("------------------");
			sb.append(cnt).append('\n');
		}
		System.out.println(sb);
	}
}