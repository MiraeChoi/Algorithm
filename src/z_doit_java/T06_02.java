package z_doit_java;

import java.util.Scanner;

class T06_02 {
	static void bubbleSort(int[] arr, int n) {
		for(int i = 0; i < n-1; i++) {
			int cnt = 0;
			
			for(int j = n-1; j > i; j--) {
				if(arr[j-1] > arr[j]) {
					int tmp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = tmp;
					cnt++;
				}
			}
			if(cnt == 0) break;
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
