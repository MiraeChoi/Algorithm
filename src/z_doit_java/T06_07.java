package z_doit_java;

import java.util.Scanner;

class T06_07 {
	static void shellSort(int[] arr, int n) {
		int i;
		for(i = 1; i < n/9; i = i*3+1) {
			System.out.println("들어옴 '3')");
			System.out.println("i : " + i);
		}
		System.out.println("i : " + i);
		for( ; i > 0; i /= 3) {
			for(int j = i; j < n; j++) {
				int k;
				int tmp = arr[j];
				
				for(k = j-i; k >= 0 && arr[k] > tmp; k -= i) {
					arr[k+i] = arr[k];
				}
				arr[k+i] = tmp;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("셀 정렬(버전 2)");
		System.out.print("요소 수 : ");
		int n = kb.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.printf("arr[%d] : ", i);
			arr[i] = kb.nextInt();
		}
		shellSort(arr, n);
		
		System.out.println("오름차순으로 정렬했습니다.");
		for(int i = 0; i < n; i++) {
			System.out.printf("arr[%d] = %d\n", i, arr[i]);
		}
	}
}
