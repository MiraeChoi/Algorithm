package z_doit_java;

import java.util.Scanner;

class T05_04 {
	static void recur(int n) {
		while(n > 0) {
			recur(n-1);
			System.out.println(n);
			n = n-2;
		}
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("정수를 입력하세요. : ");
		int n = kb.nextInt();
		recur(n);
	}
}
