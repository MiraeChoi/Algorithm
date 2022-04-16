package z_doit_java;

import java.util.Scanner;

class T04_04C1 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		final int n = 3;
		int[] a = new int[n];
		int cnt = 0;
		int retry;
		
		System.out.println("정수를 입력하세요.");
		do {
			System.out.printf("%d번째 정수 : ", cnt + 1);
			a[cnt++ % n] = kb.nextInt();
			System.out.print("계속할까요? (예.1/아니오.0) : ");
			retry = kb.nextInt();
		} while(retry == 1);
		
		int i = cnt - n;
		if(i < 0) i = 0;
		for(; i < cnt; i++) System.out.printf("%2d번째의 정수 : %d\n", i + 1, a[i % n]);
	}
}
