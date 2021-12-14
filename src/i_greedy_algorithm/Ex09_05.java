package i_greedy_algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Num05 {
	int b, c;
	
	public Num05(int b, int c) {
		this.b = b;
		this.c = c;
	}
}

class Ex09_05 {
	static int n, m;
	static int[] ch, cost;
	static ArrayList<ArrayList<Num05>> graph;
	
	public void BFS(int v) {
		Queue<Integer> Q = new LinkedList<>();
		ch[v] = 1;
		cost[v] = 0;
		Q.offer(v);
		
		while(!Q.isEmpty()) {
			int cv = Q.poll();
			for(int i = 0; i < graph.get(cv).size(); i++) {
				int nv = graph.get(cv).get(i).b;
				if(ch[nv] == 0) {
					ch[nv] = 1;
					Q.offer(nv);
					cost[nv] = cost[cv] + graph.get(cv).get(i).c;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Ex09_05 T = new Ex09_05();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		ch = new int[n+1];
		cost = new int[n+1];
		graph = new ArrayList<>();
		for(int i = 0; i <= n; i++) graph.add(new ArrayList<>());
		for(int i = 0; i < m; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			int c = kb.nextInt();
			graph.get(a).add(new Num05(b, c));
		}
		T.BFS(1);
		for(int i = 2; i <= n; i++) {
			if(cost[i] == 0) System.out.println(i + " : impossible");
			else System.out.println(i + " : " + cost[i]);
		}
	}
}
