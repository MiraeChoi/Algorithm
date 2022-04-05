package g_recursive_tree_graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Ex07_14 {
	//설명
	//다음 그래프에서 1번 정점에서 각 정점으로 가는 최소 이동 간선수를 출력하세요.
	//1 < 2 > 5
	//↓ ↘  ↗ ↖↑
	//3 > 4 > 6
	
	//입력
	//첫째 줄에는 정점의 수 N(1<=N<=20)과 간선의 수 M이 주어진다. 그 다음부터 M줄에 걸쳐 연결정보가 주어진다.
	
	//출력
	//1번 정점에서 각 정점으로 가는 최소 간선 수를 2번 정점부터 차례대로 출력하세요.
	static int n, m;
	static int[] ch;
	static ArrayList<ArrayList<Integer>> graph;
	static HashMap<Integer, Integer> answer;
	
	public void BFS(int v) {
		Queue<Integer> Q = new LinkedList<>();
		answer = new HashMap<>();
		Q.offer(1);
		int e = 2;
		int cnt = Integer.MAX_VALUE;
		
		while(e <= n) {
			int len = Q.size();
			
			for(int nv : graph.get(v)) {
				int cur = Q.poll();
				
				if(cur == e) {
					System.out.println(nv + " : " + cnt);
					e++;
					cnt = 0;
					break;
				}
				if(ch[nv] == 0) {
					ch[nv] = 1;
					Q.offer(nv);
				}
				System.out.println(nv + " : " + cnt);
				cnt++;
			}
		}
	}
	
	public static void main(String[] args) {
		Ex07_14 T = new Ex07_14();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		ch = new int[n+1];
		graph = new ArrayList<>();
		for(int i = 0; i <= n; i++) {
			graph.add(new ArrayList<>());
		}
		for(int i = 0; i < m; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			graph.get(a).add(b);
		}
		ch[1] = 1;
		T.BFS(1);
		for(int i = 1; i < graph.size(); i++) {
			if(i != 1) System.out.println(i + " : " + answer.get(i));
		}
	}
}
