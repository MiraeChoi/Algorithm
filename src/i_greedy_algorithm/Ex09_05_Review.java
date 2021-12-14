package i_greedy_algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

class Edge05R implements Comparable<Edge05R>{
	int idx, cost;
	
	public Edge05R(int idx, int cost) {
		this.idx = idx;
		this.cost = cost;
	}

	@Override
	public int compareTo(Edge05R o) {
		return this.cost - o.cost;
	}
}

class Ex09_05_Review {
	static int n, m;
	static int[] dis;
	static ArrayList<ArrayList<Edge05R>> arr;
	
	public void solution(int v) {
		PriorityQueue<Edge05R> pQ = new PriorityQueue<>();
		pQ.offer(new Edge05R(v, 0));
		dis[v] = 0;
		
		while(!pQ.isEmpty()) {
			Edge05R tmp = pQ.poll();
			int now = tmp.idx;
			int nowCost = tmp.cost;
			if(nowCost > dis[now]) continue;
			
			for(Edge05R ob : arr.get(now)) {
				if(dis[ob.idx] > nowCost + ob.cost) {
					dis[ob.idx] = nowCost + ob.cost;
					pQ.offer(new Edge05R(ob.idx, nowCost + ob.cost));
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Ex09_05_Review T = new Ex09_05_Review();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		dis = new int[n+1];
		Arrays.fill(dis, Integer.MAX_VALUE);
		arr = new ArrayList<>();
		for(int i = 0; i <= n; i++) {
			arr.add(new ArrayList<>());
		}
		for(int i = 0; i < m; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			int c = kb.nextInt();
			arr.get(a).add(new Edge05R(b, c));
		}
		T.solution(1);
		for(int i = 2; i <= n; i++) {
			if(dis[i] != Integer.MAX_VALUE) System.out.println(i + " : " + dis[i]);
			else System.out.println(i + " : impossible");
		}
	}
}
