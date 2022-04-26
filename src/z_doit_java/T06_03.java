package z_doit_java;

import java.util.Scanner;

class T06_03 {
	static void bubbleSort(int[] arr, int n) {
		int k = 0;
		
		while(k < n-1) {
			int last = n-1;
			for(int j = n-1; j > k; j--) {
				if(arr[j-1] > arr[j]) {
					int tmp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = tmp;
					last = j;
				}
			}
			k = last;
		}
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("���� ����(���� 1)");
		System.out.print("��� �� : ");
		int n = kb.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("arr[" + i + "] : ");
			arr[i] = kb.nextInt();
		}
		
		bubbleSort(arr, n);
		
		System.out.println("������������ �����߽��ϴ�.");
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
	}
}
