package f_sorting_n_searching;

import java.util.Scanner;

class Ex06_04_M {
	public int[] solution(int size, int n, int[] arr) {
		int[] cache = new int[size];
		for(int i = 0; i < size; i++) cache[i] = 0;
		
		for(int i = 0; i < n; i++) {
			int idx = 0;
			
			for(int j = 0; j < size; j++) {
				if(arr[i] == cache[j]) {
					idx = j;
					break;
				}
			}
			
			System.out.println("idx : " + idx);
			
			if(idx == 0) { //miss
				for(int j = size-2; j >= 0; j--) {
					cache[j+1] = cache[j];
					
					for(int k = 0; k < size; k++) {
						System.out.print(cache[k] + " ");
					}
					System.out.println();
				}
			} else {//hit
				for(int j = idx-1; j >= 0; j--) {
					cache[j+1] = cache[j];
				}
			}
			cache[0] = arr[i];
			for(int j = 0; j < size; j++) {
				System.out.print(cache[j] + " ");
			}
			System.out.println();
		}
		
		return cache;
	}
	
	public static void main(String[] args) {
		Ex06_04_M T = new Ex06_04_M();
		Scanner kb = new Scanner(System.in);
		int size = kb.nextInt();
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		for(int x : T.solution(size, n, arr)) System.out.print(x + " ");
	}
}
