package g_recursive_tree_graph;

import java.util.Scanner;

class Ex07_01_Review {
	public void DFS(int n) {
		if(n == 0) return;
		else {
			DFS(n-1);
			System.out.print(n + " ");
		}
	}
	
	public static void main(String[] args) {
		Ex07_01_Review T = new Ex07_01_Review();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		T.DFS(n);
	}
}
