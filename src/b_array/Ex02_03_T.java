package b_array;

import java.util.Scanner;

class Ex02_03_T {
	public String[] solution(int n, int[] a, int[] b) {
		String[] answer = new String[n];
		
		for(int i = 0; i < n; i++) {
			if(a[i] == b[i]) answer[i] = "D";
			else if(a[i] == 1 && b[i] == 3) answer[i] = "A";
			else if(a[i] == 2 && b[i] == 1) answer[i] = "A";
			else if(a[i] == 3 && b[i] == 2) answer[i] = "A";
			else answer[i] = "B";
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex02_03_T T = new Ex02_03_T();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		
		for(int i = 0; i < n; i++) a[i] = kb.nextInt();
		for(int i = 0; i < n; i++) b[i] = kb.nextInt();
		
		for(String x : T.solution(n, a, b)) System.out.println(x);
	}
}
