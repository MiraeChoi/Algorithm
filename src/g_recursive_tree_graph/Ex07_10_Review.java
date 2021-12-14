package g_recursive_tree_graph;

import java.util.LinkedList;
import java.util.Queue;

class Node710R {
	int data;
	Node710R lt, rt;
	
	public Node710R(int val) {
		data = val;
		lt = rt = null;
	}
}

class Ex07_10_Review {
	Node710R root;
	
	public int BFS(Node710R root) {
		Queue<Node710R> Q = new LinkedList<>();
		Q.offer(root);
		int L = 0;
		
		while(!Q.isEmpty()) {
			int len = Q.size();
			
			for(int i = 0; i < len; i++) {
				Node710R cur = Q.poll();
				
				if(cur.lt == null && cur.rt == null) return L;
				if(cur.lt != null) Q.offer(cur.lt);
				if(cur.rt != null) Q.offer(cur.rt);
			}
			L++;
		}
		return L;
	}
	
	public static void main(String[] args) {
		Ex07_10_Review tree = new Ex07_10_Review();
		tree.root = new Node710R(1);
		tree.root.lt = new Node710R(2);
		tree.root.rt = new Node710R(3);
		tree.root.lt.lt = new Node710R(4);
		tree.root.lt.rt = new Node710R(5);
		System.out.println(tree.BFS(tree.root));
	}
}
