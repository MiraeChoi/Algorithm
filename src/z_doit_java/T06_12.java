package z_doit_java;

import java.util.Scanner;

class T06_12 {
	static int[] buff;
	
	static void __mergeSort(int[] arr, int left, int right) {
		
	}
	
	static void mergeSort(int[] arr, int n) {
		buff = new int[n];
		__mergeSort(arr, 0, n-1);
		buff = null;
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("���� ����");
		System.out.print("��� �� : ");
		int n = kb.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.printf("arr[%d] : ", i);
			arr[i] = kb.nextInt();
		}
		mergeSort(arr, n);
		
		System.out.println("������������ �����߽��ϴ�.");
		for(int i = 0; i < n; i++) {
			System.out.printf("arr[%d] = %d\n", i, arr[i]);
		}
	}
}
