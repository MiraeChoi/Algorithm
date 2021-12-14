package g_recursive_tree_graph;

import java.util.Scanner;

class Ex07_03 {
	int answer = 1;
	
	public int DFS(int n) {
		if(n == 0) return answer;
		else {
			answer = answer * n;
			DFS(n-1);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Ex07_03 T = new Ex07_03();
		Scanner kb = new Scanner(System.in);
		System.out.println(T.DFS(kb.nextInt()));
	}
}
