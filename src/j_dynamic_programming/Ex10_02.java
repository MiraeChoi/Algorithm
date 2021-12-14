package j_dynamic_programming;

import java.util.Scanner;

class Ex10_02 {
	static int[] dy;
	
	public int solution(int n) {
		dy[0] = 1;
		dy[1] = 2;
		for(int i = 2; i <= n; i++) dy[i] = dy[i-2] + dy[i-1];
		return dy[n];
	}
	
	public static void main(String[] args) {
		Ex10_02 T = new Ex10_02();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		dy = new int[n+1];
		System.out.println(T.solution(n));
	}
}
