package f_sorting_n_searching;

import java.util.Arrays;
import java.util.Scanner;

class Ex06_08_M {
	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		Arrays.sort(arr);
		int lt = 0, rt = n-1;
		
		for(int i = 0; i < n; i++) {
			int mid = (lt + rt) / 2;
			
			if(arr[mid] == m) answer = mid + 1;
			else if(arr[mid] > m) rt = mid - 1;
			else lt = mid + 1;
			
			if(lt > rt) break;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Ex06_08_M T = new Ex06_08_M();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		System.out.println(T.solution(n, m, arr));
	}
}
