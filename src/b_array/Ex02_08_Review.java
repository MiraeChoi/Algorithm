package b_array;

import java.util.Scanner;

class Ex02_08_Review {
	public int[] solution(int n, int[] arr) {
		int[] answer = new int[n];
		
		for(int i = 0; i < n; i++) {
			int count = 1;
			
			for(int j = 0; j < n; j++) {
				if(arr[j] > arr[i]) count++;
			}
			answer[i] = count;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex02_08_Review T = new Ex02_08_Review();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		for(int x : T.solution(n, arr)) System.out.print(x + " ");
	}
}
