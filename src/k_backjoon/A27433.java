package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A27433 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double N = Double.parseDouble(br.readLine());
		double answer = 1;
		for(double i = 2; i <= N; i++) answer *= i;
		System.out.print(answer);
	}
}