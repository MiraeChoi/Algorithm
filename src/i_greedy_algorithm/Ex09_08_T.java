package i_greedy_algorithm;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

class Edge08T implements Comparable<Edge08T>{
	int vex, cost;
	
	public Edge08T(int vex, int cost) {
		this.vex = vex;
		this.cost = cost;
	}

	@Override
	public int compareTo(Edge08T o) {
		return this.cost - o.cost;
	}
}

class Ex09_08_T {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		ArrayList<ArrayList<Edge08T>> graph = new ArrayList<>();
		for(int i = 0; i <= n; i++) graph.add(new ArrayList<>());
		int[] ch = new int[n+1];
		for(int i = 0; i < m; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			int c = kb.nextInt();
			graph.get(a).add(new Edge08T(b, c));
			graph.get(b).add(new Edge08T(a, c));
		}
		int answer = 0;
		PriorityQueue<Edge08T> pQ = new PriorityQueue<>();
		pQ.offer(new Edge08T(1, 0));
		while(!pQ.isEmpty()) {
			Edge08T tmp = pQ.poll();
			int ev = tmp.vex;
			if(ch[ev] == 0) {
				ch[ev] = 1;
				answer += tmp.cost;
				
				for(Edge08T ob : graph.get(ev)) {
					if(ch[ob.vex] == 0) pQ.offer(new Edge08T(ob.vex, ob.cost));
				}
			}
		}
		System.out.println(answer);
	}
}
