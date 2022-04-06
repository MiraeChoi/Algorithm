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
	//설명
	//아래의 가중치 방향그래프에서 1번 정점에서 모든 정점으로의 최소 거리비용을 출력하는 프로그램을 작성하세요.
	//(경로가 없으면 impossible을 출력한다)
	
	//입력
	//첫째 줄에는 정점의 수 N(1<=N<=20)과 간선의 수 M이 주어진다. 그 다음부터 M줄에 걸쳐 연결정보와 거리비용이 주어진다.
	
	//출력
	//1번 정점에서 각 정점으로 가는 최소비용을 2번 정점부터 차례대로 출력하세요.
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
