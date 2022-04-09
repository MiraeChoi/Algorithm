package z_doit_java;

import java.util.Scanner;

class T2_4 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("키의 최댓값을 구합니다.\n사람 수 : ");
		int[] a = new int[kb.nextInt()];
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i < a.length; i++) {
			System.out.print("height[" + i + "] : ");
			a[i] = kb.nextInt();
			if(a[i] > max) max = a[i];
		}
		System.out.println("최댓값은 " + max + "입니다.");
	}
}
