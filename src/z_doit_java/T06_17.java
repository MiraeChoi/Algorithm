package z_doit_java;

import java.util.Scanner;

class T06_17 {
	static void fSort(int[] arr, int n, int max) {
		int[] f = new int[max+1];
		int[] b = new int[n];
		
		for(int i = 0;   i < n;    i++) f[arr[i]]++;
		for(int i = 1;   i <= max; i++) f[i] += f[i-1];
		for(int i = n-1; i >= 0;   i--) b[--f[arr[i]]] = arr[i];
		for(int i = 0;   i < n;    i++) arr[i] = b[i];
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("도수 정렬");
		System.out.print("요소 수 : ");
		int n = kb.nextInt();
		int[] arr = new int[n];
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i < n; i++) {
			do {
				System.out.printf("arr[%d] : ", i);
				arr[i] = kb.nextInt();
				max = Math.max(max, arr[i]);
			} while(arr[i] < 0);
		}
		fSort(arr, n, max);
		
		System.out.println("오름차순으로 정렬했습니다.");
		for(int i = 0; i < n; i++) {
			System.out.printf("arr[%d] = %d\n", i, arr[i]);
		}
	}
}
