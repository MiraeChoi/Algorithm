package g_recursive_tree_graph;

import java.util.ArrayList;
import java.util.Scanner;

class Ex07_13_Review {
	static int n, m, answer;
	static int[] ch;
	static ArrayList<ArrayList<Integer>> graph;
	
	public void DFS(int v) {
		if(v == n) answer++;
		else {
			for(int nx : graph.get(v)) {
				if(ch[nx] == 0) {
					ch[nx] = 1;
					DFS(nx);
					ch[nx] = 0;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Ex07_13_Review T = new Ex07_13_Review();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		ch = new int[n+1];
		graph = new ArrayList<>();
		for(int i = 0; i < n+1; i++) graph.add(new ArrayList<>());
		for(int i = 0; i < m; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			graph.get(a).add(b);
		}
		ch[1] = 1;
		T.DFS(1);
		System.out.println(answer);
	}
}
