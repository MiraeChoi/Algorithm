package g_recursive_tree_graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Ex07_14_T {
	static int n, m;
	static int[] ch, dis;
	static ArrayList<ArrayList<Integer>> graph;
	
	public void BFS(int v) {
		Queue<Integer> Q = new LinkedList<>();
		ch[v] = 1;
		dis[v] = 0;
		Q.offer(v);
		
		while(!Q.isEmpty()) {
			int cv = Q.poll();
			for(int nv : graph.get(cv)) {
				if(ch[nv] == 0) {
					ch[nv] = 1;
					Q.offer(nv);
					dis[nv] = dis[cv] + 1;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Ex07_14_T T = new Ex07_14_T();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		ch = new int[n+1];
		dis = new int[n+1];
		graph = new ArrayList<>();
		for(int i = 0; i <= n; i++) graph.add(new ArrayList<>());
		for(int i = 0; i < m; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			graph.get(a).add(b);
		}
		T.BFS(1);
		for(int i = 2; i <= n; i++) System.out.println(i + " : " + dis[i]);
	}
}