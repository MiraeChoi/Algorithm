package b_array;

import java.util.Scanner;

class Ex02_04_T {
	//2. ¼ÕÄÚµù
	public void solution(int n) {
		int a=1, b=1, c;
		System.out.print(a + " " + b + " ");
		
		for(int i = 2; i < n; i++) {
			c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
		}
	}
	
	public static void main(String[] args) {
		Ex02_04_T T = new Ex02_04_T();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		T.solution(n);
	}
}
