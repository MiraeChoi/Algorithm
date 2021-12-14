package i_greedy_algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

class Point07 implements Comparable<Point07> {
	int vex, cost;
	
	public Point07(int vex, int cost) {
		this.vex = vex;
		this.cost = cost;
	}

	@Override
	public int compareTo(Point07 o) {
		return this.cost - o.cost;
	}
}

class Ex09_07 {
	static int v, e;
	static ArrayList<ArrayList<Point07>> arr;
	static int[] dis, unf;
	
	public static int Find(int v) {
		if(v == unf[v]) return v;
		else return unf[v] = Find(unf[v]);
	}
	
	public static void Union(int a, int b, int c) {
		int fa = Find(a);
		int fb = Find(b);
		if(fa != fb) unf[fa] = fb;
	}
	
	public static void solution(int v) {
		PriorityQueue<Point07> pQ = new PriorityQueue<>();
		pQ.offer(new Point07(v, 0));
		dis[v] = 0;
		
		while(!pQ.isEmpty()) {
			Point07 tmp = pQ.poll();
			int now = tmp.vex;
			int nowCost = tmp.cost;
			if(nowCost > dis[now]) continue;
			
			for(Point07 ob : arr.get(now)) {
				if(dis[ob.vex] > nowCost + ob.cost) {
					dis[ob.vex] = nowCost + ob.cost;
					pQ.offer(new Point07(ob.vex, nowCost + ob.cost));
				}
			}
		}
		
		for(int i = 1; i < dis.length; i++) {
			System.out.println("dis : " + dis[i]);
		}
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		v = kb.nextInt();
		e = kb.nextInt();
		dis = new int[v+1];
		unf = new int[v+1];
		arr = new ArrayList<>();
		Arrays.fill(dis, Integer.MAX_VALUE);
		for(int i = 0; i <= v; i++) {
			unf[i] = i;
			arr.add(new ArrayList<>());
		}
		for(int i = 0; i < e; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			int c = kb.nextInt();
			arr.get(a).add(new Point07(b, c));
		}
		solution(1);
		int answer = 0;
		for(int i = 1; i <= v; i++) {
			answer += dis[i];
		}
		System.out.println(answer);
	}
}
