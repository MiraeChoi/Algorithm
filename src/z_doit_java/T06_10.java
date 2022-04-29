package z_doit_java;

import java.util.Scanner;
import java.util.Stack;

class T06_10 {
	static void quickSort(int[] arr, int l, int r) {
		Stack<Integer> lstack = new Stack<>();
		Stack<Integer> rstack = new Stack<>();
		lstack.push(l);
		rstack.push(r);
		
		while(!lstack.isEmpty()) {
			int pl = l = lstack.pop();
			int pr = r = rstack.pop();
			int pivot = arr[(l+r)/2];
			
			//
			System.out.printf("arr[%d] ~ arr[%d] : {", l, r);
			for(int i = l; i < r; i++) {
				System.out.printf("%d, ", arr[i]);
			}
			System.out.printf("%d}\n", arr[r]);
			//
			
			do {
				while(arr[pl] < pivot) pl++;
				while(arr[pr] > pivot) pr--;
				if(pl <= pr) {
					int tmp = arr[pl];
					arr[pl] = arr[pr];
					arr[pr] = tmp;
					pl++; pr--;
				}
			} while(pl <= pr);
			
			if(l < pr) {
				lstack.push(l);
				rstack.push(pr);
			}
			if(pl < r) {
				lstack.push(pl);
				rstack.push(r);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("퀵 정렬(비재귀 버전)");
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
