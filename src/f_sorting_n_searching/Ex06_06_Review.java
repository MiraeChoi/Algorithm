package f_sorting_n_searching;

import java.util.Arrays;
import java.util.Scanner;

class Ex06_06_Review {
	public int[] solution(int n, int[] arr) {
		int[] answer = new int[2];
		int[] tmp = arr.clone();
		Arrays.sort(tmp);
		
		int idx = 0;
		
		for(int i = 0; i < n; i++) {
			if(arr[i] != tmp[i]) {
				answer[idx] = i+1;
				idx++;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Ex06_06_Review T = new Ex06_06_Review();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		for(int x : T.solution(n, arr)) System.out.print(x + " ");
	}
}
