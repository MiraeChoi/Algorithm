package f_sorting_n_searching;

import java.util.Scanner;

class Ex06_03 {
	public int[] solution(int n, int[] arr) {
		for(int i = 1; i < n; i++) {
			int key = arr[i];
			
			for(int j = i-1; j >= 0; j--) {
				System.out.print("(" + j + ", " + i + ") ");
				if(arr[j] > key) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
			System.out.println();
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		Ex06_03 T = new Ex06_03();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		for(int x : T.solution(n, arr)) System.out.print(x + " ");
	}
}
