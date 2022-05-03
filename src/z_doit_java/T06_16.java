package z_doit_java;

import java.util.Scanner;

class T06_16 {
	static void downHeap(int[] arr, int left, int right) {
		int tmp = arr[left];
		int parent;
		int child;
		
		for(parent = left; parent < (right+1)/2; parent = child) {
			int cl = parent * 2 + 1;
			int cr = cl + 1;
			child = (cr <= right && arr[cr] > arr[cl]) ? cr : cl;
			
			if(tmp >= arr[child]) break;
			arr[parent] = arr[child];
		}
		arr[parent] = tmp;
	}
	
	static void heapSort(int[] arr, int n) {
		for(int i = (n-1)/2; i >= 0; i--) downHeap(arr, i, n-1);
		for(int i = n-1; i > 0; i--) {
			int tmp = arr[0];
			arr[0] = arr[i];
			arr[i] = tmp;
			downHeap(arr, 0, i-1);
		}
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("힙 정렬");
		System.out.print("요소 수 : ");
		int n = kb.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.printf("arr[%d] : ", i);
			arr[i] = kb.nextInt();
		}
		heapSort(arr, n);
		
		System.out.println("오름차순으로 정렬했습니다.");
		for(int i = 0; i < n; i++) {
			System.out.printf("arr[%d] = %d\n", i, arr[i]);
		}
	}
}
