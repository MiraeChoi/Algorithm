package k_backjoon;

import java.io.IOException;

public class A5622_2 {
	public static void main(String[] args) throws IOException {
		int n, answer = 0;
		while((n = System.in.read() - 65) > -1) {
			System.out.println(n);
			answer += (n - n / 18 - n / 25) / 3 + 3;
		}
		System.out.print(answer);
	}
}
