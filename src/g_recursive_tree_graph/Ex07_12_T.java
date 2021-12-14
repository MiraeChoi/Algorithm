package g_recursive_tree_graph;

import java.util.Scanner;

class Ex07_12_T {
	static int n, m, answer = 0;
	static int[] ch;
	static int[][] graph;
	
	public void DFS(int v) {
		if(v == n) answer++;
		else {
			for(int i = 1; i <= n; i++) {
				if(graph[v][i] == 1 && ch[i] == 0) {
					ch[i] = 1;
					DFS(i);
					ch[i] = 0;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Ex07_12_T T = new Ex07_12_T();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		ch = new int[n+1];
		graph = new int[n+1][n+1];
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
