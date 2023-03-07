package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A24416 {
	//맞았습니다!!
	private static int[] f;
	private static int a1 = 0, a2 = 0;
	
	private static int fib(int n) {
		if(n == 1 || n == 2) {
			a1++;
			return 1;
		}
		else return fib(n - 1) + fib(n - 2);
	}
	
	private static int fibonacci(int n) {
		f[1] = f[2] = 1;
		for(int i = 3; i <= n; i++) {
			a2++;
			f[i] = f[i - 1] + f[i - 2];
		}
		return f[n];
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		f = new int[n + 1];
		fib(n); fibonacci(n);
		System.out.println(a1 + " " + a2);
	}
}