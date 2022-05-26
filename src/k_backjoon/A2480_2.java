package k_backjoon;

import java.util.Scanner;

public class A2480_2 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int a = kb.nextInt();
		int b = kb.nextInt();
		int c = kb.nextInt();
		
		if(a == b && b == c) System.out.println(10000 + a * 1000);
		else if(a == b || a == c) System.out.println(1000 + a * 100);
		else if(b == c) System.out.println(1000 + b * 100);
		else {
			int max = Math.max(a, Math.max(b, c));
			System.out.println(max * 100);
		}
	}
}
