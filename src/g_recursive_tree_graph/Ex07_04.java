package g_recursive_tree_graph;

import java.util.Scanner;

class Ex07_04 {
	int n0 = 0;
	int n1 = 1;
	
	public void DFS(int n) {
		if(n == 0) return;
		else {
			DFS(n-1);
			System.out.print(n1 + " ");
			int tmp = n1;
			n1 = n0 + n1;
			n0 = tmp;
		}
	}
	
	public static void main(String[] args) {
		Ex07_04 T = new Ex07_04();
		Scanner kb = new Scanner(System.in);
		T.DFS(kb.nextInt());
	}
}
