package f_sorting_n_searching;

import java.util.Scanner;

class Ex06_04_Review {
	public int[] solution(int size, int n, int[] arr) {
		int[] cache = new int[size];
		
		for(int i = 0; i < n; i++) {
			int pos = -1;
			for(int j = 0; j < size; j++) if(arr[i] == cache[j]) pos = j;
			
			if(pos == -1) for(int j = size-1; j >= 1; j--) cache[j] = cache[j-1];
			else for(int j = pos; j >= 1; j--) cache[j] = cache[j-1];
			cache[0] = arr[i];
		}
		return cache;
	}
	
	public static void main(String[] args) {
		Ex06_04_Review T = new Ex06_04_Review();
		Scanner kb = new Scanner(System.in);
		int size = kb.nextInt();
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		for(int x : T.solution(size, n, arr)) System.out.print(x + " ");
	}
}
