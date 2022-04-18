package z_doit_java;

import java.util.Scanner;

class T05_02 {
	static int gcd(int x, int y) {
		for(int i = 2; i < Math.max(x, y); i++) {
			if(x % i == 0 && y % i == 0) return i;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("두 정수의 최대공약수를 구합니다.");
		System.out.print("정수를 입력하세요. : "); int x = kb.nextInt();
		System.out.print("정수를 입력하세요. : "); int y = kb.nextInt();
		System.out.println("최대공약수는 " + gcd(x, y) + "입니다.");
	}
}
