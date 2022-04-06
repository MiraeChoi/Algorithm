package i_greedy_algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

class Edge05T implements Comparable<Edge05T>{
	public int vex, cost;
	
	public Edge05T(int vex, int cost) {
		this.vex = vex;
		this.cost = cost;
	}

	@Override
	public int compareTo(Edge05T o) {
		return this.cost - o.cost;
	}
}

class Ex09_05_T {
	//설명
	//아래의 가중치 방향그래프에서 1번 정점에서 모든 정점으로의 최소 거리비용을 출력하는 프로그램을 작성하세요.
	//(경로가 없으면 impossible을 출력한다)
	
	//입력
	//첫째 줄에는 정점의 수 N(1<=N<=20)과 간선의 수 M이 주어진다. 그 다음부터 M줄에 걸쳐 연결정보와 거리비용이 주어진다.
	
	//출력
	//1번 정점에서 각 정점으로 가는 최소비용을 2번 정점부터 차례대로 출력하세요.
	static int n, m;
	static int[] dis;
	static ArrayList<ArrayList<Edge05T>> graph;
	
	public void solution(int v) {
		PriorityQueue<Edge05T> pQ = new PriorityQueue<>();
		pQ.offer(new Edge05T(v, 0));
		dis[v] = 0;
		
		while(!pQ.isEmpty()) {
			Edge05T tmp = pQ.poll();
			int now = tmp.vex;
			int nowCost = tmp.cost;
			if(nowCost > dis[now]) continue;
			
			for(Edge05T ob : graph.get(now)) {
				if(dis[ob.vex] > nowCost + ob.cost) {
					dis[ob.vex] = nowCost + ob.cost;
					pQ.offer(new Edge05T(ob.vex, nowCost + ob.cost));
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Ex09_05_T T = new Ex09_05_T();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		graph = new ArrayList<>();
		for(int i = 0; i <= n; i++) {
			graph.add(new ArrayList<>());
		}
		dis = new int[n+1];
		Arrays.fill(dis, Integer.MAX_VALUE);
		for(int i = 0; i < m; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			int c = kb.nextInt();
			graph.get(a).add(new Edge05T(b, c));
		}
		T.solution(1);
		for(int i = 2; i <= n; i++) {
			if(dis[i] != Integer.MAX_VALUE) System.out.println(i + " : " + dis[i]);
			else System.out.println(i + " : impossible");
		}
	}
}
