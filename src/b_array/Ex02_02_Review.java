package b_array;

import java.util.Scanner;

class Ex02_02_Review {
	public int solution(int n, int[] arr) {
		int answer = 1;
		int max = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > max) {
				answer++;
				max = arr[i];
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex02_02_Review T = new Ex02_02_Review();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		
		System.out.print(T.solution(n, arr));
	}
}
