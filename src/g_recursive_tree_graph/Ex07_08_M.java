package g_recursive_tree_graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Calf {
	int data;
	Calf p5, p1, m1;
	
	public Calf(int n) {
		data = n;
		p5 = p1 = m1 = null;
	}
}

class Ex07_08_M {
	static Calf calf1;
	static int E;
	static int L = 0;
	static Queue<Integer> Q = new LinkedList<>();
	
	public void BFS(Calf calf) {
		if(calf == null) return;
		if(calf.data == E) {
			System.out.println(L);
			return;
		}
		Q.offer(calf.data);
		
		int len = Q.size();
		
		for(int i = 0; i < len; i++) {
			int cur = Q.poll();
			
			int p1 = cur + 1;
			int m1 = cur - 1;
			int p5 = cur + 5;
			
			if(p1 == E || m1 == E || p5 == E) {
				System.out.println(++L);
				return;
			}
			
			if(!Q.contains(p1)) {
				Q.offer(p1);
				calf.p1 = new Calf(p1);
			}
			if(!Q.contains(m1)) {
				Q.offer(m1);
				calf.m1 = new Calf(m1);
			}
			if(!Q.contains(p5)) {
				Q.offer(p5);
				calf.p5 = new Calf(p5);
			}
		}
		L++;
		
		if(calf.p1 != null) BFS(calf.p1);
		if(calf.m1 != null) BFS(calf.m1);
		if(calf.p5 != null) BFS(calf.p5);
	}
	
	public static void main(String[] args) {
		Ex07_08_M T = new Ex07_08_M();
		Scanner kb = new Scanner(System.in);
		int S = kb.nextInt();
		E = kb.nextInt();
		T.BFS(calf1 = new Calf(S));
	}
}
