package z_doit_java;

import java.util.Scanner;

class T01_08 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("���� �Ʒ��� ������ �̵ �ﰢ���� ����մϴ�.");
		System.out.print("�� �� �ﰢ���Դϱ�? : ");
		int n = kb.nextInt();
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) System.out.print("*");
			System.out.println();
		}
	}
}
