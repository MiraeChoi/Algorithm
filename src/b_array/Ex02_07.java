package b_array;

import java.util.Scanner;

class Ex02_07 {
	public int solution(int n, int[] arr) {
		int answer = 0;
		int count = 0;
		
		for(int i = 0; i < n; i++) {
			if(arr[i] == 1) {
				count++;
				answer += count;
			}
			else count = 0;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex02_07 T = new Ex02_07();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		
		System.out.print(T.solution(n, arr));
	}
}
