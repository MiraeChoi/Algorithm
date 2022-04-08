package z_doit_java;

import java.util.Scanner;

class T1_3 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("정수를 입력하세요. : ");
		int n = kb.nextInt();
		if(n > 0) System.out.println("이 수는 양수입니다.");
		else if(n < 0) System.out.println("이 수는 음수입니다.");
		else System.out.println("이 수는 0입니다.");
	}
}
