package z_doit_java;

import java.util.Scanner;

class T05_03 {
	static void recur(int n) {
		if(n > 0) {
			recur(n-1);
			System.out.println(n);
			recur(n-2);
		}
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���. " );
		int n = kb.nextInt();
		recur(n);
	}
}
