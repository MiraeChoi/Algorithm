package k_backjoon;

import java.util.Scanner;

public class A1003_2 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int[] zero = new int[41];
		int[] one = new int[41];
		
		zero[0] = 1;
		one[0] = 0;
		zero[1] = 0;
		one[1] = 1;
		
		for(int i = 2; i <= 40; i++){
			zero[i] = zero[i-1] + zero[i-2];
			one[i] = one[i-1] + one[i-2];
		}
		int len = kb.nextInt();
		
		for(int i = 0; i < len; i++){
			int n = kb.nextInt();
			sb.append(zero[n]).append(' ').append(one[n]).append('\n');
		}
		System.out.println(sb);
    }
}