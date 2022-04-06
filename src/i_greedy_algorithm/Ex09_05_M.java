package i_greedy_algorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point05M {
	int dot, cost;
	
	public Point05M(int dot, int cost) {
		this.dot = dot;
		this.cost = cost;
	}
}

class Ex09_05_M {
	//설명
	//아래의 가중치 방향그래프에서 1번 정점에서 모든 정점으로의 최소 거리비용을 출력하는 프로그램을 작성하세요.
	//(경로가 없으면 impossible을 출력한다)
	
	//입력
	//첫째 줄에는 정점의 수 N(1<=N<=20)과 간선의 수 M이 주어진다. 그 다음부터 M줄에 걸쳐 연결정보와 거리비용이 주어진다.
	
	//출력
	//1번 정점에서 각 정점으로 가는 최소비용을 2번 정점부터 차례대로 출력하세요.
	static int n, m;
	static int[] dis;
	static int[][] graph;
	static Queue<Point05M> Q = new LinkedList<Point05M>();
	
	public void BFS() {
		Q.offer(new Point05M(1, 0));  
		
		for(int i = 1; i <= n; i++) {
			int tmpi = i;
			
			for(int j = 1; j <= n; j++) {
				if(i != j && graph[i][j] != 0 && graph[i][j] < dis[i]) {
					dis[i] = graph[i][j];
					i = j;
				}
			}
			i = tmpi;
		}
	}
	
	public static void main(String[] args) {
		Ex09_05_M T = new Ex09_05_M();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		dis = new int[n+1];
		for(int i = 1; i <= n; i++) {
			dis[i] = Integer.MAX_VALUE;
		}
		graph = new int[n+1][n+1];
		for(int i = 0; i < m; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			int c = kb.nextInt();
			graph[a][b] = c;
		}
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				System.out.print(graph[i][j] + " ");
			}
			System.out.println();
		}
		T.BFS();
		for(int i = 2; i <= n; i++) {
			System.out.print(i + " : ");
			if(dis[i] == Integer.MAX_VALUE) System.out.println("impossible");
			else System.out.println(dis[i]);
		}
	}
}
