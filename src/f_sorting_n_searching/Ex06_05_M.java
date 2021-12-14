package f_sorting_n_searching;

import java.util.Scanner;

class Ex06_05_M {
	public String solution(int n, int[] arr) {
		//Time Limit Exceeded
		String answer = "U";
		
		for(int i = 1; i < n; i++) {
			int tmp = arr[i], j;
			
			for(j = i-1; j >= 0; j--) {
				if(tmp < arr[j]) arr[j+1] = arr[j];
				else break;
			}
			arr[j+1] = tmp;
		}
		
		for(int i = 0; i < n-1; i++) if(arr[i] == arr[i+1]) return "D";
		return answer;
	}
	
	public static void main(String[] args) {
		Ex06_05_M T = new Ex06_05_M();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		System.out.println(T.solution(n, arr));
	}
}
