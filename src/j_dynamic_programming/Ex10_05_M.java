package j_dynamic_programming;

import java.util.Arrays;
import java.util.Scanner;

class Ex10_05_M {
	static int[] dy;
	
	public int solution(int n, int m, int[] coin) {
		dy[0] = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 1; j <= m; j++) {
				if(j - coin[i] >= 0) dy[j] = Math.min(dy[j], dy[j - coin[i]] + 1);
			}
		}
		for(int i = 0; i <= m; i++) System.out.print(dy[i] + " ");
		System.out.println();
		return dy[m];
	}
	
	public static void main(String[] args) {
		Ex10_05_M T = new Ex10_05_M();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] coin = new int[n];
		for(int i = 0; i < n; i++) coin[i] = kb.nextInt();
		int m = kb.nextInt();
		dy = new int[m+1];
		Arrays.fill(dy, Integer.MAX_VALUE);
		System.out.println(T.solution(n, m, coin));
	}
}
