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
		System.out.println("�� ������ �ִ������� ���մϴ�.");
		System.out.print("������ �Է��ϼ���. : "); int x = kb.nextInt();
		System.out.print("������ �Է��ϼ���. : "); int y = kb.nextInt();
		System.out.println("�ִ������� " + gcd(x, y) + "�Դϴ�.");
	}
}
