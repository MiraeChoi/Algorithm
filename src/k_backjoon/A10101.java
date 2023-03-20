package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A10101 {
	//맞았습니다!!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		if(a + b + c == 180) {
			if(a == b && b == c) System.out.println("Equilateral");
			else if(a == c || b == c || a == c) System.out.println("Isosceles");
			else System.out.println("Scalene");
		} else System.out.println("Error");
	}
}