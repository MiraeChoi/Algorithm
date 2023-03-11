package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A1735_2 {
	private static int GCD(int a, int b) {
		if(b == 0) return a;
		else return GCD(b, a % b);	
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A1 = Integer.parseInt(st.nextToken());
		int B1 = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int A2 = Integer.parseInt(st.nextToken());
		int B2 = Integer.parseInt(st.nextToken());
		
		int A = B1 * B2;
		int B = A1 * B2 + B1 * A2;
		int gcd = GCD(A, B);
		A /= gcd;
		B /= gcd;
		System.out.println(B + " " + A);
	}
}