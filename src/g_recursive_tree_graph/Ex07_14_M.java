package g_recursive_tree_graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Ex07_14_M {
	//설명
	//다음 그래프에서 1번 정점에서 각 정점으로 가는 최소 이동 간선수를 출력하세요.
	//1 < 2 > 5
	//↓ ↘  ↗ ↖↑
	//3 > 4 > 6
	
	//입력
	//첫째 줄에는 정점의 수 N(1<=N<=20)과 간선의 수 M이 주어진다. 그 다음부터 M줄에 걸쳐 연결정보가 주어진다.
	
	//출력
	//1번 정점에서 각 정점으로 가는 최소 간선 수를 2번 정점부터 차례대로 출력하세요.
	static int[] dis;
	static int n, m;
	static Queue<Integer> Q = new LinkedList<>();
	static ArrayList<ArrayList<Integer>> graph;
	
	public void BFS(int v) {
		Q.offer(v);
		dis[v] = 0;
		
		while(Q.size() < n) {
			for(int nv : graph.get(v)) {
				if(!Q.contains(nv)) {
					dis[nv] = dis[v] + 1;
					Q.offer(nv);
				}
			}
			if(graph.get(v).size() > 0) v = graph.get(v).get(0);
			else v++;
		}
	}
	
	public static void main(String[] args) {
		Ex07_14_M T = new Ex07_14_M();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		dis = new int[n+1];
		graph = new ArrayList<>();
		for(int i = 0; i <= n; i++) graph.add(new ArrayList<>());
		for(int i = 0; i < m; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			graph.get(a).add(b);
		}
		T.BFS(1);
		for(int i = 2; i < dis.length; i++) {
			System.out.println(i + " : " + dis[i]);
		}
	}
}
