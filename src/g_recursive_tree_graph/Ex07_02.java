package g_recursive_tree_graph;

import java.util.Scanner;

class Ex07_02 {
	public void DFS(int n) {
		if(n == 0) return;
		else {
			DFS(n / 2);
			System.out.print(n % 2);
		}
	}
	
	public static void main(String[] args) {
		Ex07_02 T = new Ex07_02();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		T.DFS(n);
	}
}
