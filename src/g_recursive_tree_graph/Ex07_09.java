package g_recursive_tree_graph;

import java.util.LinkedList;
import java.util.Queue;

class Node79 {
	int data;
	Node79 lt, rt;
	
	public Node79(int n) {
		data = n;
		lt = rt = null;
	}
}

class Ex07_09 {
	static Node79 node;
	int L = 0;
	int min = Integer.MAX_VALUE;
	
	public void DFS(Node79 root) {
		Queue<Node79> Q = new LinkedList<>();
		Q.offer(root);
		
		while(!Q.isEmpty()) {
			int len = Q.size();
			
			for(int i = 0; i < len; i++) {
				Node79 cur = Q.poll();
				
				if(cur.lt != null) Q.offer(cur.lt);
				if(cur.rt != null) Q.offer(cur.rt);
				if(cur.lt == null && cur.rt == null) {
					L++;
					if(L < min) {
						min = L;
						L = 0;
					}
				}
			}
		}
		System.out.println(min);
	}
	
	public static void main(String[] args) {
		Ex07_09 T = new Ex07_09();
		node = new Node79(1);
		node.lt = new Node79(2);
		node.rt = new Node79(3);
		node.lt.lt = new Node79(4);
		node.lt.rt = new Node79(5);
		T.DFS(node);
	}
}