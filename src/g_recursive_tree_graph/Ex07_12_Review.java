package g_recursive_tree_graph;

import java.util.Scanner;

class Ex07_12_Review {
	static int n, m, answer = 0;
	static int[][] graph;
	static int[] ch;
	
	public void DFS(int v) {
		if(v == n) answer++;
		else {
			for(int i = 1; i < graph.length; i++) {
				if(graph[v][i] == 1 && ch[i] == 0) {
					ch[i] = 1;
					DFS(i);
					ch[i] = 0;
				}	
			}
		}
	}
	
	public static void main(String[] args) {
		Ex07_12_Review T = new Ex07_12_Review();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		graph = new int[n+1][n+1];
		ch = new int[n+1];
		for(int i = 0; i < m; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			graph[a][b] = 1;
		}
		ch[1] = 1;
		T.DFS(1);
		System.out.println(answer);
	}
}
