package i_greedy_algorithm;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

class Edge08R implements Comparable<Edge08R>{
	int vex, cost;
	
	public Edge08R(int vex, int cost) {
		this.vex = vex;
		this.cost = cost;
	}

	@Override
	public int compareTo(Edge08R o) {
		return this.cost - o.cost;
	}
}

class Ex09_08_Review {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int v = kb.nextInt();
		int e = kb.nextInt();
		int[] ch = new int[v+1];
		ArrayList<ArrayList<Edge08R>> arr = new ArrayList<>();
		for(int i = 0; i <= v; i++) arr.add(new ArrayList<>());
		for(int i = 0; i < e; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			int c = kb.nextInt();
			arr.get(a).add(new Edge08R(b, c));
			arr.get(b).add(new Edge08R(a, c));
		}
		int answer = 0;
		PriorityQueue<Edge08R> pQ = new PriorityQueue<>();
		pQ.offer(new Edge08R(1, 0));
		while(!pQ.isEmpty()) {
			Edge08R tmp = pQ.poll();
			int ev = tmp.vex;
			if(ch[ev] == 0) {
				ch[ev] = 1;
				answer += tmp.cost;
				for(Edge08R ob : arr.get(ev)) {
					if(ch[ob.vex] == 0) pQ.offer(new Edge08R(ob.vex, ob.cost));
				}
			}
		}
		System.out.println(answer);
	}
}
