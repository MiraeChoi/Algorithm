package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A9506 {
	//맞았습니다!!
	private static boolean check(int n) {
		int sum = 0;
		for(int i = 1; i <= n / 2; i++) {
			if(n % i == 0) sum += i;
			if(sum > n) return false;
		}
		if(sum == n) return true;
		else return false;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true) {
			int n = Integer.parseInt(br.readLine());
			if(n == -1) break;
			if(check(n)) {
				sb.append(n).append(" = ");
				int sum = 0;
				for(int i = 1; i <= n / 2; i++) {
					if(n % i == 0) {
						sum += i;
						sb.append(i);
						if(sum == n) break;
						sb.append(" + ");
					}
				}
				sb.append('\n');
			} else sb.append(n).append(" is NOT perfect.").append('\n');
		}
		System.out.print(sb);
	}
}