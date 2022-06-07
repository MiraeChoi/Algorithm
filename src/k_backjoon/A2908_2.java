package k_backjoon;

import java.util.Scanner;

class A2908_2 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String s1 = new StringBuffer(kb.next()).reverse().toString();
		String s2 = new StringBuffer(kb.next()).reverse().toString();
		System.out.println(Math.max(Integer.parseInt(s1), Integer.parseInt(s2)));
	}
}
