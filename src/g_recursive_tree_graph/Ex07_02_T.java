package g_recursive_tree_graph;

import java.util.Scanner;

class Ex07_02_T {
	public void DFS(int n) {
		if(n == 0) return;
		else {
			DFS(n / 2);
			System.out.print(n % 2);
		}
	}
	
	public static void main(String[] args) {
		Ex07_02_T T = new Ex07_02_T();
		Scanner kb = new Scanner(System.in);
		T.DFS(kb.nextInt());
	}
}
