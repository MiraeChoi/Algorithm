package z_doit_java;

import java.util.Scanner;

class T06_09 {
	static void quickSort(int[] arr, int l, int r) {
		int pl = l;
		int pr = r;
		int pivot = arr[(pl+pr)/2];
		
		do {
			while(arr[pl] < pivot) pl++;
			while(arr[pr] > pivot) pr--;
			if(pl <= pr) {
				int tmp = arr[pl];
				arr[pl] = arr[pr];
				arr[pr] = tmp;
				pl++; pr--;
			}
		} while(pl >= pr);
		
		if(l < pr) quickSort(arr, l, pr);
		if(pl < r) quickSort(arr, pl, r);
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("퀵 정렬");
		System.out.print("요소 수 : ");
		int n = kb.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.printf("arr[%d] : ", i);
			arr[i] = kb.nextInt();
		}
		quickSort(arr, 0, n-1);
		System.out.println("오름차순으로 정렬했습니다.");
		for(int i = 0; i < n; i++) System.out.printf("arr[%d] = %d\n", i, arr[i]);
	}
}
