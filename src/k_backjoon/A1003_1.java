package k_backjoon;

import java.util.Arrays;
import java.util.Scanner;

class A1003_1 {
	static int[] answer = new int[2];
	
	static void fibonacci(int n) {
		if (n == 0) {
	        answer[0]++;
	    } else if (n == 1) {
	        answer[1]++;
	    } else {
	    	fibonacci(n-1);
	    	fibonacci(n-2);
	    }
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		for(int i = 0; i < n; i++) {
			fibonacci(arr[i]);
			System.out.println(answer[0] + " " + answer[1]);
			Arrays.fill(answer, 0);
		}
	}
}
