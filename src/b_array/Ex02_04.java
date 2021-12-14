package b_array;

import java.util.Scanner;

class Ex02_04 {
	public int[] solution(int n) {
		int[] answer = new int[n];
		answer[0] = 1;
		
		if(n >= 2) answer[1] = 1;
		if(n >= 3) {
			for(int i = 2; i < answer.length; i++) {
				answer[i] = answer[i-2] + answer[i-1];
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex02_04 T = new Ex02_04();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		
		for(int x : T.solution(n)) System.out.print(x + " ");
	}
}
