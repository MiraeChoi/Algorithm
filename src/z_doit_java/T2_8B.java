package z_doit_java;

import java.util.Scanner;

class T2_8B {
	public static int cardConvR(int x, int r, char[] d) {
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.printf(r + "|　　　　　　　　%2d\n", x);
		
		do {
			System.out.println("　+-------------");
			d[digits++] = dchar.charAt(x % r);
			int rem = x % r;
			x /= r;
			
			if(x > 0) {
				System.out.printf(r + "|　　　　　　　　%2d", x);
				System.out.println("　... " + d[digits-1]);
			}
		} while(x != 0);
		
		System.out.printf("　　　　　　　　　　%2d", x);
		System.out.println("　... " + d[digits-1]);
		return digits;
	}
	
	public static void main(String[] args) {
		int n;
		int cd;
		int dn;
		int retry = 1;
		char[] cn = new char[32];
		
		Scanner kb = new Scanner(System.in);
		System.out.println("10진수를 기수 변환합니다.");
		do {
			do {
				System.out.print("변환하는 음이 아닌 정수 : ");
				n = kb.nextInt();
			} while(n < 0);
			
			do {
				System.out.print("어떤 진수로 변환할까요? (2~36) : ");
				cd = kb.nextInt();
			} while(cd < 2 || cd > 36);
			
			dn = cardConvR(n, cd, cn);
			System.out.print(cd + "진수로는 ");
			for(int i = dn-1; i >= 0; i--) {
				System.out.print(cn[i]);
			}
			System.out.println("입니다.");
			
			System.out.print("한 번 더 할까요? (1.예/0.아니오) : ");
			retry = kb.nextInt();
			
		} while(retry == 1);
	}
}
