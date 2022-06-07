package k_backjoon;

import java.util.Scanner;

class A2908_1 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String a = kb.next();
		String b = kb.next();
		String a2 = a.charAt(2) + "" + a.charAt(1) + "" + a.charAt(0);
		String b2 = b.charAt(2) + "" + b.charAt(1) + "" + b.charAt(0);
		int n1 = Integer.parseInt(a2);
		int n2 = Integer.parseInt(b2);
		System.out.println(Math.max(n1, n2));
	}
}
