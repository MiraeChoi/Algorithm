package z_doit_java;

import java.util.Scanner;

class T1_4n5 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값 : ");
		int n = kb.nextInt();
		int answer = 0;
//		int tmp = 1;
//		while(tmp <= n) {
//			answer += tmp;
//			tmp++;
//		}
		for(int i = 1; i <= n; i++) answer += i;
		System.out.println("1부터 " + n + "까지의 합은 " + answer + "입니다.");
	}
}
