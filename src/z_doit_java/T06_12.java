package z_doit_java;

import java.util.Scanner;

class T06_12 {
	static int[] buff;
	
	static void __mergeSort(int[] arr, int left, int right) {
		if(left < right) {
			int i;
			int center = (left + right) / 2;
			int p = 0;
			int j = 0;
			int k = left;
			
			__mergeSort(arr, left, center);
			__mergeSort(arr, center+1, right);
			
			for(i = left; i <= center; i++) buff[p++] = arr[i];
			while(i <= right && j < p) arr[k++] = (buff[j] <= arr[i]) ? buff[j++] : arr[i++];
			while(j < p) arr[k++] = buff[j++];
		}
	}
	
	static void mergeSort(int[] arr, int n) {
		buff = new int[n];
		__mergeSort(arr, 0, n-1);
		buff = null;
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("병합 정렬");
		System.out.print("요소 수 : ");
		int n = kb.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.printf("arr[%d] : ", i);
			arr[i] = kb.nextInt();
		}
		mergeSort(arr, n);
		
		System.out.println("오름차순으로 정렬했습니다.");
		for(int i = 0; i < n; i++) {
			System.out.printf("arr[%d] = %d\n", i, arr[i]);
		}
	}
}
