package z_doit_java;

import java.util.Scanner;

class T06_01P2 {
	static int cnt, ex = 0;
	
	static void bubbleSort(int[] arr, int n) {
		for(int i = 0; i < n-1; i++) {
			for(int j = n-1; j > i; j--) {
				cnt++;
				if(arr[j-1] > arr[j]) {
					int tmp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = tmp;
					ex++;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("버블 정렬(버전 1)");
		System.out.print("요소 수 : ");
		int n = kb.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("arr[" + i + "] : ");
			arr[i] = kb.nextInt();
		}
		
		bubbleSort(arr, n);
		
		System.out.println("오름차순으로 정렬했습니다.");
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
		System.out.printf("비교를 %d회 했습니다.\n", cnt);
		System.out.printf("교환을 %d회 했습니다.\n", ex);
	}
}
