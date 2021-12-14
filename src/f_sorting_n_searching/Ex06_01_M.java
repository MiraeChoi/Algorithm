package f_sorting_n_searching;

import java.util.Scanner;

class Ex06_01_M {
	public int[] solution(int n, int[] arr) {
		int[] answer = new int[n];
		
		for(int i = 0; i < n-1; i++) {
			int idx = i;
			
			for(int j = i+1; j < n; j++) {
				if(arr[j] < arr[idx]) idx = j;
			}
			
			if(arr[idx] < arr[i]) {
				int tmp = arr[idx];
				arr[idx] = arr[i];
				arr[i] = tmp;
			}
		}
		
		for(int i = 0; i < n; i++) answer[i] = arr[i];
		return answer;
	}
	
	public static void main(String[] args) {
		Ex06_01_M T = new Ex06_01_M();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		for(int x : T.solution(n, arr)) System.out.print(x + " ");
	}
}
