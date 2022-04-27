package z_doit_java;

import java.util.Scanner;

class T06_05 {
	static void insertionSort(int[] arr, int n) {
		for(int i = 1; i < n; i++) {
			int j;
			int tmp = arr[i];
			
			for(j = i; j > 0 && arr[j-1] > tmp; j--) {
				arr[j] = arr[j-1];
			}
			arr[j] = tmp;
			for(int k = 0; k < n; k++) System.out.print(arr[k] + " ");
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("�ܼ� ���� ����");
		System.out.print("��� �� : ");
		int n = kb.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.printf("arr[%d] : ", i);
			arr[i] = kb.nextInt();
		}
		insertionSort(arr, n);
		
		System.out.println("������������ �����߽��ϴ�.");
		for(int i = 0; i < n; i++) System.out.printf("arr[%d] = %d\n", i, arr[i]);
	}
}
