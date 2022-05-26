package k_backjoon;

import java.util.Scanner;

public class A15552_1 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] answer = new int[n];
		for(int i = 0; i < n; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			answer[i] = a + b;
		}
		for(int i = 0; i < n; i++) System.out.println(answer[i]);
	}
}
