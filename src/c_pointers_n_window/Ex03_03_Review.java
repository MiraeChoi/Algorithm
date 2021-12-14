package c_pointers_n_window;

import java.util.Scanner;

class Ex03_03_Review {
	public int solution(int n, int k, int[] arr) {
		int answer = 0;
		int sum = 0;
		
		for(int i = 0; i < k; i++) sum += arr[i];
		answer = sum;
		
		for(int i = k; i < arr.length; i++) {
			sum += (arr[i] - arr[i-k]);
			answer = Math.max(answer, sum);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex03_03_Review T = new Ex03_03_Review();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		System.out.println(T.solution(n, k, arr));
	}
}
