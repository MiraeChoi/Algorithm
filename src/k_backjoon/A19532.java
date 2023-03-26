package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A19532 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());	int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());	int d = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());	int f = Integer.parseInt(st.nextToken());
		int x = 0, y = 0;
		if(a * d >= b * e) {
			
		} else {
			
		}
//		if(Math.abs(a) == Math.abs(d)) {
//			System.out.println("a");
//			if(a == d) {
////				a = a - d;
//				b = b - e;
//				c = c - f;
//			} else {
////				a = a + d;
//				b = b + e;
//				c = c + f;
//			}
//			y = b / c;
//			x = (f - e) / d;
//		} else if(Math.abs(b) == Math.abs(e)) {
//			System.out.println("b");
//			if(b == e) {
//				a = a - d;
//				c = c - f;
//			} else {
//				a = a + d;
//				c = c + f;
//			}
//			x = a / c;
//			y = (f - d) / e;
//		} else {
//			System.out.println("±× ¿Ü");
//		}
		System.out.println(x + " " + y);
	}
}