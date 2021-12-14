package b_array;

import java.util.Scanner;

class Ex02_04_Review {
//	//1. zl존초고수
//	public int[] solution(int n) {
//		int[] answer = new int[n];
//		answer[0] = 1; answer[1] = 1;
//		
//		for(int i = 2; i < n; i++) answer[i] = answer[i-2] + answer[i-1];
//		
//		return answer;
//	}
	
	//2. 손코딩
	public void solution(int n) {
		int a = 1;
		int b = 1;
		System.out.print(a + " " + b + " ");
		
		for(int i = 2; i < n; i++) {
			int c = a + b;
			System.out.print(c + " ");
			
			a = b;
			b = c;
		}
	}
	
	public static void main(String[] args) {
		Ex02_04_Review T = new Ex02_04_Review();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		
		//1. zl존초고수
//		for(int x : T.solution(n)) System.out.print(x + " ");
		//2. 손코딩
		T.solution(n);
	}
}
