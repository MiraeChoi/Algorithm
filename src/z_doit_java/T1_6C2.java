package z_doit_java;

import java.util.Scanner;

class T1_6C2 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("2�ڸ��� ������ �Է��ϼ���.");
		int n;
		do {
			System.out.print("�Է� : ");
			n = kb.nextInt();
		} while(n < 10 || n >= 100);
		System.out.println("���� no�� ���� " + n + "(��)�� �Ǿ����ϴ�.");
	}
}
