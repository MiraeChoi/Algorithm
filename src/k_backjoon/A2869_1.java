package k_backjoon;

import java.util.Scanner;

class A2869_1 {
	//시간 초과
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int v = sc.nextInt();
		int tmp = (v-a) / (a-b);
		System.out.println((tmp < 1 ? 1 : tmp) + 1);
	}
}
