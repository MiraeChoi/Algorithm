package g_recursive_tree_graph;

import java.util.LinkedList;
import java.util.Queue;

class Node710 {
	int data;
	Node710 lt, rt;
	
	public Node710(int val) {
		data = val;
		lt = rt = null;
	}
}

class Ex07_10 {
	Node710 root;
	
	public int BFS(Node710 root) {
		Queue<Node710> Q = new LinkedList<>();
		Q.offer(root);
		int L = 0;
		int answer = Integer.MAX_VALUE;
		
		while(!Q.isEmpty()) {
			int len = Q.size();
			
			for(int i = 0; i < len; i++) {
				Node710 cur = Q.poll();
				
				if(cur.lt != null && cur.rt != null) {
					Q.offer(cur.lt);
					Q.offer(cur.rt);
				} else if(cur.lt != null && cur.rt == null) {
					Q.offer(cur.lt);
				} else if(cur.lt == null && cur.rt != null) {
					Q.offer(cur.rt);
				} else if(cur.lt == null && cur.rt == null) {
					answer = Math.min(answer, L);
				}
			}
			L++;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Ex07_10 tree = new Ex07_10();
		tree.root = new Node710(1);
		tree.root.lt = new Node710(2);
		tree.root.rt = new Node710(3);
		tree.root.lt.lt = new Node710(4);
		tree.root.lt.rt = new Node710(5);
		System.out.println(tree.BFS(tree.root));
	}
}
 