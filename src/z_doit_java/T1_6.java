package z_doit_java;

import java.util.Scanner;

class T1_6 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("1부터 n까지의 합을 구합니다.");
		int n;
		do {
			System.out.print("n의 값 : ");
			n = kb.nextInt();
		} while(n <= 0);
		
		int answer = 0;
		for(int i = 1; i <= n; i++) answer += i;
		System.out.println("1부터 " + n + "까지의 합은 " + answer + "입니다.");
	}
}
