package z_doit_java;

import java.util.Scanner;

class T04_04C1 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		final int n = 3;
		int[] a = new int[n];
		int cnt = 0;
		int retry;
		
		System.out.println("������ �Է��ϼ���.");
		do {
			System.out.printf("%d��° ���� : ", cnt + 1);
			a[cnt++ % n] = kb.nextInt();
			System.out.print("����ұ��? (��.1/�ƴϿ�.0) : ");
			retry = kb.nextInt();
		} while(retry == 1);
		
		int i = cnt - n;
		if(i < 0) i = 0;
		for(; i < cnt; i++) System.out.printf("%2d��°�� ���� : %d\n", i + 1, a[i % n]);
	}
}
