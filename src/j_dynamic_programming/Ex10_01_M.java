package j_dynamic_programming;

import java.util.Scanner;

class Ex10_01_M {
	static int n, sum = 0;
	static int[] dy;
	
	public void DFS(int v) {
		if(v > n) return;
		if(v <= 2) dy[v] = v;
		else dy[v] = dy[v-2] + dy[v-1];
		v++;
		DFS(v);
	}
	
	public static void main(String[] args) {
		Ex10_01_M T = new Ex10_01_M();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		dy = new int[n+1];
		T.DFS(1);
		System.out.println(dy[n]);
	}
}
