package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A19532 {
	//런타임 에러 /by zero
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());	int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());	int d = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());	int f = Integer.parseInt(st.nextToken());
		int x = 0, y = 0;
		int a1 = a, b1 = b, c1 = c, d1 = d, e1 = e, f1 = f;
		if(a * d >= b * e) {
			int n1 = e;
			int n2 = b;
			System.out.println("n1 n2 : " + n1 + " / " + n2);
			a1 *= n1; b1 *= n1; c1 *= n1;
			d1 *= n2; e1 *= n2; f1 *= n2;
			if(b1 == e1) { a1 -= d1; b1 -= e1; c1 -= f1; }
			else		 { a1 += d1; b1 += e1; c1 += f1; }
			x = c1 / a1;
			y = (c - a * x) / b;
		} else {
			
		}
		System.out.println(x + " " + y);
	}
}