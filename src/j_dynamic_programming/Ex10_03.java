package j_dynamic_programming;

import java.util.Scanner;

class Ex10_03 {
	static int[] arr, dy;
	
	public int solution(int n) {
		dy[1] = 1;
		
		for(int i = 2; i <= n; i++) {
			if(arr[i] > arr[i-1]) dy[i] = dy[i-1] + 1;
			else dy[i] = dy[i-1];
		}
		for(int i = 1; i <= n; i++) {
			System.out.print(dy[i] + " ");
		}
		System.out.println();
		return dy[n];
	}
	
	public static void main(String[] args) {
		Ex10_03 T = new Ex10_03();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		arr = new int[n+1];
		dy = new int[n+1];
		for(int i = 1; i <= n; i++) arr[i] = kb.nextInt();
		System.out.println(T.solution(n));
	}
}
