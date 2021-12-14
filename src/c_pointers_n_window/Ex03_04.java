package c_pointers_n_window;

import java.util.Scanner;

class Ex03_04 {
	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
			for(int j = i; j < n; j++) {
				sum += arr[j];
				
				if(sum == m) {
					answer++;
					break;
				}
				if(sum > m) break;
			}
			sum = 0;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex03_04 T = new Ex03_04();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		System.out.println(T.solution(n, m, arr));
	}
}
