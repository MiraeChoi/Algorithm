package z_doit_java;

import java.util.Scanner;

class T06_04 {
	static void selectionSort(int[] arr, int n) {
		for(int i = 0; i < n-1; i++) {
			int min = i;
			
			for(int j = i+1; j < n; j++) {
				if(arr[j] < arr[min]) min = j;
			}
			int tmp = arr[min];
			arr[min] = arr[i];
			arr[i] = tmp;
		}
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("���� ����");
		System.out.print("��� �� : ");
		int n = kb.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("arr[" + i + "] : ");
			arr[i] = kb.nextInt();
		}
		
		selectionSort(arr, n);
		
		System.out.println("������������ �����߽��ϴ�.");
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
	}
}
