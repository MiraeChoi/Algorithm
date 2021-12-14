package f_sorting_n_searching;

import java.util.Scanner;

class Ex06_02_M {
	public int[] solution(int n, int[] arr) {
		int max = 0;
		
		for(int i = 0; i < n-max;) {
			for(int j = 1; j < n-max; j++) {
				if(arr[j] < arr[i]) {
					int tmp = arr[j];
					arr[j] = arr[i];
					arr[i] = tmp;
				}
				i++;
			}
			i = 0;
			max++;
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		Ex06_02_M T = new Ex06_02_M();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		for(int x : T.solution(n, arr)) System.out.print(x + " ");
	}
}
