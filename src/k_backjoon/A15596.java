package k_backjoon;

import java.util.Scanner;

public class A15596 {
	public static long sum(int[] a) {
		long answer = 0;
		for(int i = 0; i < a.length; i++) answer += a[i];
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) a[i] = kb.nextInt();
		System.out.println(sum(a));
	}
}
