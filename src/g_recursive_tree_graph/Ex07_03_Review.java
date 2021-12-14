package g_recursive_tree_graph;

import java.util.Scanner;

class Ex07_03_Review {
	public int DFS(int n) {
		if(n == 1) return 1;
		else return n * DFS(n-1);
	}
	
	public static void main(String[] args) {
		Ex07_03_Review T = new Ex07_03_Review();
		Scanner kb = new Scanner(System.in);
		System.out.println(T.DFS(kb.nextInt()));
	}
}
