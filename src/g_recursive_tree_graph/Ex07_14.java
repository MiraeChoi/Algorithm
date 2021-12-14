package g_recursive_tree_graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Ex07_14 {
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
