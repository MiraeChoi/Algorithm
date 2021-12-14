package g_recursive_tree_graph;

import java.util.LinkedList;
import java.util.Queue;

class Node710M {
	int data;
	Node710M lt, rt;
	
	public Node710M(int val) {
		data = val;
		lt = rt = null;
	}
}

class Ex07_10_M {
	Node710M root;
	
	public int solution(Node710M node) {
		int L = 0;
		Queue<Node710M> Q = new LinkedList<>();
		Q.offer(node);
		
		while(!Q.isEmpty()) {
			int len = Q.size();
			
			for(int i = 0; i < len; i++) {
				Node710M cur = Q.poll();
				
				if(cur.lt == null && cur.rt == null) return L;
				else {
					if(cur.lt != null) Q.offer(cur.lt);
					if(cur.rt != null) Q.offer(cur.rt);
				}
			}
			L++;
		}
		return L;
	}
	
	public static void main(String[] args) {
		Ex07_10_M tree = new Ex07_10_M();
		tree.root = new Node710M(1);
		tree.root.lt = new Node710M(2);
		tree.root.rt = new Node710M(3);
		tree.root.lt.lt = new Node710M(4);
		tree.root.lt.rt = new Node710M(5);
		System.out.println(tree.solution(tree.root));
	}
}
