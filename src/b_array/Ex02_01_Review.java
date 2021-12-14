package b_array;

import java.util.ArrayList;
import java.util.Scanner;

class Ex02_01_Review {
	public ArrayList<Integer> solution(int n, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		answer.add(arr[0]);
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] >= arr[i-1]) answer.add(arr[i]);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex02_01_Review T = new Ex02_01_Review();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = kb.nextInt();
		}
		
		for(int x : T.solution(n, arr)) {
			System.out.print(x + " ");
		}
	}
}
