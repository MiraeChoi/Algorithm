package z_doit_java;

import java.util.Scanner;

class T05_02 {
//	static int gcd(int x, int y) {
//		for(int i = 2; i < Math.max(x, y); i++) {
//			if(x % i == 0 && y % i == 0) return i;
//		}
//		return 0;
//	}
	
	static int gcd(int x, int y) {	//x=22, y=8		x=8, y=6	x=6, y=2	x=2, y=0
		if(y == 0) return x;												//return 2;
		else return gcd(y, x % y);	//gcd(8, 6)		gcd(6, 2)	gcd(2, 0)
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("두 정수의 최대공약수를 구합니다.");
		System.out.print("정수를 입력하세요. : "); int x = kb.nextInt();
		System.out.print("정수를 입력하세요. : "); int y = kb.nextInt();
		System.out.println("최대공약수는 " + gcd(x, y) + "입니다.");
	}
}
