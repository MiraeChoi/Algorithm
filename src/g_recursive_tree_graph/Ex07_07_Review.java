package g_recursive_tree_graph;

import java.util.LinkedList;
import java.util.Queue;

class Tree2 {
	int data;
	Tree2 lt, rt;
	
	public Tree2(int n) {
		data = n;
		lt = rt = null;
	}
}

class Ex07_07_Review {
	Tree2 root;
	
	public void BFS(Tree2 tree) {
		Queue<Tree2> Q = new LinkedList<>();
		Q.offer(tree);
		int L = 0;
		
		while(!Q.isEmpty()) {
			int len = Q.size();
			System.out.print(L + " : ");
			
			for(int i = 0; i < Q.size(); i++) {
				Tree2 cur = Q.poll();
				System.out.print(cur.data + " ");
				
				if(cur.lt != null) Q.offer(cur.lt);
				if(cur.rt != null) Q.offer(cur.rt);
			}
			L++;
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Ex07_07_Review tree = new Ex07_07_Review();
		tree.root = new Tree2(1);
		tree.root.lt = new Tree2(2);
		tree.root.rt = new Tree2(3);
		tree.root.lt.lt = new Tree2(4);
		tree.root.lt.rt = new Tree2(5);
		tree.root.rt.lt = new Tree2(6);
		tree.root.rt.rt = new Tree2(7);
		tree.BFS(tree.root);
	}
}
