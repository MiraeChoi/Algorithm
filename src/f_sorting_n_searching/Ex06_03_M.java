package f_sorting_n_searching;

import java.util.Scanner;

class Ex06_03_M {
	public int[] solution(int n, int[] arr) {
		for(int i = 1; i < n; i++) {
			int tmp = arr[i], j;
			
			for(j = i-1; j >= 0; j--) {
				if(arr[j] > tmp) {
					arr[j+1] = arr[j];
				} else break;
				
				for(int k = 0; k < n; k++) System.out.print(arr[k] + " ");
				System.out.println();
			}
			arr[j+1] = tmp;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		Ex06_03_M T = new Ex06_03_M();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		for(int x : T.solution(n, arr)) System.out.print(x + " ");
	}
}
