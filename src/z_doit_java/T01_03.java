package z_doit_java;

import java.util.Scanner;

class T01_03 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���. : ");
		int n = kb.nextInt();
		if(n > 0) System.out.println("�� ���� ����Դϴ�.");
		else if(n < 0) System.out.println("�� ���� �����Դϴ�.");
		else System.out.println("�� ���� 0�Դϴ�.");
	}
}
