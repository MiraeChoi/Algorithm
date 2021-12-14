package g_recursive_tree_graph;

class Node79R {
	int data;
	Node79R lt, rt;
	
	public Node79R(int val) {
		data = val;
		lt = rt = null;
	}
}

class Ex07_09_Review {
	Node79R root;
	
	public int DFS(int L, Node79R root) {
		if(root.lt == null && root.rt == null) return L;
		else return Math.min(DFS(L+1, root.lt), DFS(L+1, root.rt));
	}
	
	public static void main(String[] args) {
		Ex07_09_Review tree = new Ex07_09_Review();
		tree.root = new Node79R(1);
		tree.root.lt = new Node79R(2);
		tree.root.rt = new Node79R(3);
		tree.root.lt.lt = new Node79R(4);
		tree.root.lt.rt = new Node79R(4);
		System.out.println(tree.DFS(0, tree.root));
	}
}
