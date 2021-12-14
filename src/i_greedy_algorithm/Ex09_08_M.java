package i_greedy_algorithm;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

class Edge08M implements Comparable<Edge08M>{
	int vex, cost;
	
	public Edge08M(int vex, int cost) {
		this.vex = vex;
		this.cost = cost;
	}

	@Override
	public int compareTo(Edge08M o) {
		return this.cost - o.cost;
	}
}

class Ex09_08_M {
	static int v, e, answer = 0;
	static int[] ch;
	static ArrayList<ArrayList<Edge08M>> arr;
	
	public void solution(int v) {
		PriorityQueue<Edge08M> pQ = new PriorityQueue<>();
		pQ.offer(new Edge08M(v, 0));
		
		while(!pQ.isEmpty()) {
			Edge08M tmp = pQ.poll();
			int nv = tmp.vex;
			int nc = tmp.cost;
			
			if(ch[nv] == 0) {
				ch[nv] = 1;
				answer += nc;
				
				for(int i = 1; i < arr.size(); i++) {
					for(int j = 0; j < arr.get(i).size(); j++) {
						if(arr.get(i).get(j).vex == nv && ch[i] == 0) {
							pQ.offer(new Edge08M(i, arr.get(i).get(j).cost));
						}
					}
				}
				for(Edge08M ob : arr.get(nv)) {
					if(ch[ob.vex] == 0) {
						pQ.offer(new Edge08M(ob.vex, ob.cost));
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Ex09_08_M T = new Ex09_08_M();
		Scanner kb = new Scanner(System.in);
		v = kb.nextInt();
		e = kb.nextInt();
		ch = new int[v+1];
		arr = new ArrayList<>();
		for(int i = 0; i <= e; i++) arr.add(new ArrayList<>());
		for(int i = 0; i < e; i++) {
			int v1 = kb.nextInt();
			int v2 = kb.nextInt();
			int cost = kb.nextInt();
			arr.get(v1).add(new Edge08M(v2, cost));
		}
		T.solution(1);
		System.out.println(answer);
	}
}
