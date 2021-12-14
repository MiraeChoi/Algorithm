package i_greedy_algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

class Edge08 implements Comparable<Edge08>{
	public int v1, v2, cost;
	
	public Edge08(int v1, int v2, int cost) {
		this.v1 = v1;
		this.v2 = v2;
		this.cost = cost;
	}

	@Override
	public int compareTo(Edge08 o) {
		return this.cost - o.cost;
	}
}

class Ex09_08 {
	static int v, e, answer = 0;
	static int[] unf;
	static ArrayList<Edge08> arr = new ArrayList<>();
	
	public int Find(int v) {
		if(v == unf[v]) return v;
		else return unf[v] = Find(unf[v]);
	}
	
	public void solution(int v1, int v2, int cost) {
		PriorityQueue<Edge08> pQ = new PriorityQueue<>();
		pQ.offer(new Edge08(v1, v2, cost));
		for(int i = 1; i <= v; i++) unf[i] = i;
		
		while(!pQ.isEmpty()) {
			Edge08 tmp = pQ.poll();
//			int nv1 = tmp.v1;
//			int nv2 = tmp.v2;
//			int nCost = tmp.cost;
			
			for(Edge08 ob : arr) {
				if(unf[ob.v1] != unf[ob.v2]) {
					pQ.offer(new Edge08(ob.v1, ob.v2, ob.cost));
					answer += ob.cost;
					unf[ob.v1] = Find(unf[ob.v1]);
					unf[ob.v2] = Find(unf[ob.v2]);
//					unf[ob.v1] = unf[ob.v2] = v + 1;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Ex09_08 T = new Ex09_08();
		Scanner kb = new Scanner(System.in);
		v = kb.nextInt();
		e = kb.nextInt();
		unf = new int[v+1];
		for(int i = 0; i < e; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			int c = kb.nextInt();
			arr.add(new Edge08(a, b, c));
		}
		Collections.sort(arr);
		Edge08 tmp = arr.get(0);
		T.solution(tmp.v1, tmp.v2, tmp.cost);
		System.out.println(answer);
	}
}
