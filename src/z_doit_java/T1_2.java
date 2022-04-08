package z_doit_java;

import java.util.Scanner;

class T1_2 {
	public int solution(int a, int b, int c) {
		int max = a;
		if(b > max) max = b;
		if(c > max) max = c;
		return max;
	}
	
	public static void main(String[] args) {
		T1_2 T = new T1_2();
		Scanner kb = new Scanner(System.in);
		int a = kb.nextInt();
		int b = kb.nextInt();
		int c = kb.nextInt();
		System.out.println(T.solution(a, b, c));
	}
}
