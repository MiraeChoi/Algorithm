package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A1735_2 {
	private static int GCD(int a, int b) {	//a=20, b=14	a=14, b=6	a=6, b=2	a=2, b=0
		if(b == 0) return a;				//										return 2
		else return GCD(b, a % b);			//GCD(14, 6)	GCD(6, 2)	GCD(2, 0)
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A1 = Integer.parseInt(st.nextToken());	//2
		int B1 = Integer.parseInt(st.nextToken());	//4
		st = new StringTokenizer(br.readLine());
		int A2 = Integer.parseInt(st.nextToken());	//1
		int B2 = Integer.parseInt(st.nextToken());	//5
		
		int A = B1 * B2;							//A = 20
		int B = A1 * B2 + B1 * A2;					//B = 10 + 4 = 14
		int gcd = GCD(A, B);						//GCD(20, 14)
		A /= gcd;									//A / 2 = 10
		B /= gcd;									//B / 2 = 7
		System.out.println(B + " " + A);
	}
}