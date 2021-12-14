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
