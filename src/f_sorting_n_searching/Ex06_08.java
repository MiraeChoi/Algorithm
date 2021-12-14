package f_sorting_n_searching;

import java.util.Arrays;
import java.util.Scanner;

class Ex06_08 {
	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		Arrays.sort(arr);
		
		for(int i = 0; i < n; i++) if(arr[i] == m) answer = i+1;
		return answer;
	}
	
	public static void main(String[] args) {
		Ex06_08 T = new Ex06_08();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		System.out.println(T.solution(n, m, arr));
	}
}
