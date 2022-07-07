package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A10870 {
	static int num;
	static int[] fibo;
	
	static int DFS(int n) {
		fibo[n] = fibo[n-1] + fibo[n-2];
		if(n == num) return fibo[n];
		else return DFS(n+1);
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		num = Integer.parseInt(br.readLine());
		if(num <= 1) System.out.println(num);
		else {
			fibo = new int[num + 1];
			fibo[0] = 0;
			fibo[1] = 1;
			System.out.println(DFS(2));
		}
		br.close();
	}
}