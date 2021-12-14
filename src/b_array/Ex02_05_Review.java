package b_array;

import java.util.Scanner;

class Ex02_05_Review {
	public int solution(int n) {
		int answer = 0;
		int[] arr = new int[n+1];
		
		for(int i = 2; i <= n; i++) {
			if(arr[i] == 0) {
				answer++;
				
				for(int j = i; j <= n; j=j+i) arr[j] = 1;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex02_05_Review T = new Ex02_05_Review();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.print(T.solution(n));
	}
}
