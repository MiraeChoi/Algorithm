package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A24262 {
	private static int answer = 0;
	
	private static int MenOfPassion(int A[], int n) {
		answer++;
		int i = n / 2;
		return A[i];
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		MenOfPassion(null, n);
		System.out.println(answer);
	}
}