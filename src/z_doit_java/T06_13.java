package z_doit_java;

import java.util.Arrays;
import java.util.Scanner;

class T06_13 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("��� �� : ");
		int n = kb.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.printf("arr[%d] : ", i);
			arr[i] = kb.nextInt();
		}
		Arrays.sort(arr);
		
		System.out.println("������������ �����߽��ϴ�.");
		for(int i = 0; i < n; i++) {
			System.out.printf("arr[%d] = %d\n", i, arr[i]);
		}
	}
}
