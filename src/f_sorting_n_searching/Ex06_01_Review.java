package f_sorting_n_searching;

import java.util.Scanner;

class Ex06_01_Review {
	public int[] solution(int n, int[] arr) {
		for(int i = 0; i < n-1; i++) {
			int idx = i;
			
			for(int j = i+1; j < n; j++) {
				if(arr[j] < arr[idx]) idx = j;
			}
			
			int tmp = arr[i];
			arr[i] = arr[idx];
			arr[idx] = tmp;
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		Ex06_01_Review T = new Ex06_01_Review();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++) arr[i] = kb.nextInt();
		for(int x : T.solution(n, arr)) System.out.print(x + " ");
	}
}
