package g_recursive_tree_graph;

class Node79T {
	int data;
	Node79T lt, rt;
	
	public Node79T(int val) {
		data = val;
		lt = rt = null;
	}
}

class Ex07_09_T {
	Node79T root;
	
	public int DFS(int L, Node79T root) {
		if(root.lt == null && root.rt == null) return L;
		else return Math.min(DFS(L+1, root.lt), DFS(L+1, root.rt));
	}
	
	public static void main(String[] args) {
		Ex07_09_T tree = new Ex07_09_T();
		tree.root = new Node79T(1);
		tree.root.lt = new Node79T(2);
		tree.root.rt = new Node79T(3);
		tree.root.lt.lt = new Node79T(4);
		tree.root.lt.rt = new Node79T(5);
		System.out.println(tree.DFS(0, tree.root));
	}
}
