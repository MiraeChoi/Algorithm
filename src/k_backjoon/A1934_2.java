package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A1934_2 {
	//유클리드 호제법 : gcd(a, b) = gcd(b, r)
	private static int gcd(int a, int b) {
		while(b > 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		return a;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		while(T-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			sb.append(A * B / gcd(A, B)).append('\n');
		}
		System.out.println(sb);
	}
}