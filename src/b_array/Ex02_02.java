package b_array;

import java.util.Scanner;

class Ex02_02 {
	public int solution(int n, int[] arr) {
		int answer = 1;
		int height = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > height) {
				answer++;
				height = arr[i];
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex02_02 T = new Ex02_02();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = kb.nextInt();
		}
		
		System.out.print(T.solution(n, arr));
	}
}
