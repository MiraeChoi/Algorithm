package i_greedy_algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Edge07R implements Comparable<Edge07R>{
	int v1, v2, cost;
	
	public Edge07R(int v1, int v2, int cost) {
		this.v1 = v1;
		this.v2 = v2;
		this.cost = cost;
	}

	@Override
	public int compareTo(Edge07R o) {
		return this.cost - o.cost;
	}
}

class Ex09_07_Review {
	static int[] unf;
	
	public static int Find(int v) {
		if(v == unf[v]) return v;
		else return unf[v] = Find(unf[v]);
	}
	
	public static void Union(int a, int b) {
		int fa = Find(a);
		int fb = Find(b);
		if(fa != fb) unf[fa] = fb;
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int v = kb.nextInt();
		int e = kb.nextInt();
		unf = new int[v+1];
		for(int i = 0; i <= v; i++) unf[i] = i;
		ArrayList<Edge07R> arr = new ArrayList<>();
		for(int i = 0; i < e; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			int c = kb.nextInt();
			arr.add(new Edge07R(a, b, c));
		}
		Collections.sort(arr);
		int answer = 0;
		for(Edge07R ob : arr) {
			int fa = Find(ob.v1);
			int fb = Find(ob.v2);
			if(fa != fb) {
				Union(fa, fb);
				answer += ob.cost;
			}
		}
		System.out.println(answer);
	}
}
