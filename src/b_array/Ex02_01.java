package b_array;

import java.util.ArrayList;
import java.util.Scanner;

class Ex02_01 {
	public ArrayList<Integer> solution(int n, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		
		for(int i = 0; i < arr.length; i++) {
			if(i == 0) {
				answer.add(arr[i]);
				continue;
			}
			else if(arr[i] >= arr[i-1]) answer.add(arr[i]);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex02_01 T = new Ex02_01();
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
