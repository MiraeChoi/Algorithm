package z_doit_java;

import java.util.Scanner;

class T1_4n5 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("1���� n������ ���� ���մϴ�.");
		System.out.print("n�� �� : ");
		int n = kb.nextInt();
		int answer = 0;
//		int tmp = 1;
//		while(tmp <= n) {
//			answer += tmp;
//			tmp++;
//		}
		for(int i = 1; i <= n; i++) answer += i;
		System.out.println("1���� " + n + "������ ���� " + answer + "�Դϴ�.");
	}
}
