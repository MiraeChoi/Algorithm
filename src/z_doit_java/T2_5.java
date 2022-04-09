package z_doit_java;

import java.util.Random;
import java.util.Scanner;

class T2_5 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		Random random = new Random();
		System.out.print("키의 최댓값을 구합니다.\n사람 수 : ");
		int[] a = new int[kb.nextInt()];
		int max = Integer.MIN_VALUE;
		
		System.out.println("키 값은 아래와 같습니다.");
		for(int i = 0; i < a.length; i++) {
			a[i] = 100 + random.nextInt(90);
			System.out.println("height[" + i + "] : " + a[i]);
			if(a[i] > max) max = a[i];
		}
		System.out.println("최댓값은 " + max + "입니다.");
	}
}
