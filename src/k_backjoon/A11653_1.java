package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A11653_1 {
	//맞았습니다!!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		while(n >= 2) {
			if(n % 2 == 0) {
				while(n % 2 == 0) {
					System.out.println(2);
					n /= 2;
				}
			}
			for(int i = 3; i <= n; i += 2) {
				if(n % i == 0) {
					while(n % i == 0) {
						System.out.println(i);
						n /= i;
					}
				}
			}
		}
	}
}
