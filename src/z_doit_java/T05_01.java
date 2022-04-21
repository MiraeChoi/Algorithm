package z_doit_java;

import java.util.Scanner;

class T05_01 {
//	static int factorial(int n) {
//		int answer = 1;
//		if(n <= 2) return n;
//		else {
//			for(int i = n; i >= 1; i--) answer *= i;
//			return answer;
//		}
//	}
	
	static int factorial(int n) {
		if(n > 0) return n * factorial(n-1);
		else return 1;
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("정수를 입력하세요. : ");
		int n = kb.nextInt();
		System.out.println(n + "의 팩토리얼은 " + factorial(n) + "입니다.");
	}
}
