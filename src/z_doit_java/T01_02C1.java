package z_doit_java;

import java.util.Scanner;

class T01_02C1 {
	public int solution(int a, int b, int c) {
		if(a >= b) {
			if(b >= c) return b;
			else if(c >= a) return a;
			else return c;
		}
		else if(a > c) return a;
		else if(b > c) return c;
		else return b;
	}
	
	public static void main(String[] args) {
		T01_02C1 T = new T01_02C1();
		Scanner kb = new Scanner(System.in);
		int a = kb.nextInt();
		int b = kb.nextInt();
		int c = kb.nextInt();
		System.out.println(T.solution(a, b, c));
	}
}
