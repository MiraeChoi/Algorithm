package i_greedy_algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Edge07M implements Comparable<Edge07M> {
	int v1, v2, cost;
	
	public Edge07M(int v1, int v2, int cost) {
		this.v1 = v1;
		this.v2 = v2;
		this.cost = cost;
	}

	@Override
	public int compareTo(Edge07M o) {
		return this.cost - o.cost;
	}
}

class Ex09_07_M {
	static int v, e, answer = 0;
	static int[] unf;
	static ArrayList<Edge07M> graph;
	
	public static int Find(int v) {
		if(v == unf[v]) return v;
		else return unf[v] = Find(unf[v]);
	}
	
	public static void Union(int v1, int v2, int cost) {
		int fa = Find(v1);
		int fb = Find(v2);
		if(fa != fb) {
			unf[fa] = fb;
			answer += cost;
		}
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		v = kb.nextInt();
		e = kb.nextInt();
		unf = new int[v+1];
		graph = new ArrayList<>();
		for(int i = 1; i <= v; i++) unf[i] = i;
		for(int i = 0; i < e; i++) {
			int v1 = kb.nextInt();
			int v2 = kb.nextInt();
			int cost = kb.nextInt();
			graph.add(new Edge07M(v1, v2, cost));
		}
		Collections.sort(graph);
		for(Edge07M tmp : graph) Union(tmp.v1, tmp.v2, tmp.cost);
		System.out.println(answer);
	}
}
