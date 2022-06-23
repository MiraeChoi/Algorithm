package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A2581 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		int sum = 0, min = Integer.MAX_VALUE;
		
		out : for(int i = m; i <= n; i++) {
			if(i == 2) {
				sum += i;
				min = Math.min(i, min);
			}
			if(i % 2 == 0 || i == 1) continue;
			for(int j = 3; j < i; j += 2) {
				if(i % j == 0) continue out;
			}
			sum += i;
			min = Math.min(i, min);
		}
		if(sum == 0) System.out.println(-1);
		else System.out.println(sum + "\n" + min);
	}
}
