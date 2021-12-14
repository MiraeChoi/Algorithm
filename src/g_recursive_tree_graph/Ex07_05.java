package g_recursive_tree_graph;

import java.util.Scanner;

class Ex07_05 {
	static int[] fibo;
	static int depth = 1;
	
	public int DFS(int n) {
		if(n == 1) return fibo[0] = 1;
		else {
			int cnt = 1;
			while(n != depth * 2 - 1) {
				depth = depth * 2;
				cnt++;
			}
			System.out.println("우하하 내 깊이 : " + cnt);
		}
		return n;
	}
	
	public static void main(String[] args) {
		Ex07_05 T = new Ex07_05();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		fibo = new int[n];
		T.DFS(n);
		for(int i = 0; i < fibo.length; i++) System.out.print(fibo[i] + " ");
	}
}
