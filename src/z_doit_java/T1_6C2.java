package z_doit_java;

import java.util.Scanner;

class T1_6C2 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("2자리의 정수를 입력하세요.");
		int n;
		do {
			System.out.print("입력 : ");
			n = kb.nextInt();
		} while(n < 10 || n >= 100);
		System.out.println("변수 no의 값은 " + n + "(이)가 되었습니다.");
	}
}
