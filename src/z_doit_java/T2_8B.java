package z_doit_java;

import java.util.Scanner;

class T2_8B {
	public static int cardConvR(int x, int r, char[] d) {
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.printf(r + "|����������������%2d\n", x);
		
		do {
			System.out.println("��+-------------");
			d[digits++] = dchar.charAt(x % r);
			int rem = x % r;
			x /= r;
			
			if(x > 0) {
				System.out.printf(r + "|����������������%2d", x);
				System.out.println("��... " + d[digits-1]);
			}
		} while(x != 0);
		
		System.out.printf("��������������������%2d", x);
		System.out.println("��... " + d[digits-1]);
		return digits;
	}
	
	public static void main(String[] args) {
		int n;
		int cd;
		int dn;
		int retry = 1;
		char[] cn = new char[32];
		
		Scanner kb = new Scanner(System.in);
		System.out.println("10������ ��� ��ȯ�մϴ�.");
		do {
			do {
				System.out.print("��ȯ�ϴ� ���� �ƴ� ���� : ");
				n = kb.nextInt();
			} while(n < 0);
			
			do {
				System.out.print("� ������ ��ȯ�ұ��? (2~36) : ");
				cd = kb.nextInt();
			} while(cd < 2 || cd > 36);
			
			dn = cardConvR(n, cd, cn);
			System.out.print(cd + "�����δ� ");
			for(int i = dn-1; i >= 0; i--) {
				System.out.print(cn[i]);
			}
			System.out.println("�Դϴ�.");
			
			System.out.print("�� �� �� �ұ��? (1.��/0.�ƴϿ�) : ");
			retry = kb.nextInt();
			
		} while(retry == 1);
	}
}
