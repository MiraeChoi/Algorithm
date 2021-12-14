package b_array;

import java.util.Scanner;

class Ex02_08 {
	public int[] solution(int n, int[] arr) {
		int[] answer = new int[n];
		
		for(int i = 0; i < n; i++) answer[i] = 1;
		
		for(int i = 1; i < n; i++) {
			for(int j = 0; j < i; j++) {
				if(arr[j] > arr[i]) answer[i]++;
				else if(arr[j] < arr[i]) answer[j]++;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex02_08 T = new Ex02_08();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		for(int x : T.solution(n, arr)) System.out.print(x + " ");
	}
}
