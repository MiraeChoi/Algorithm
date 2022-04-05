package g_recursive_tree_graph;

class Node2 {
	int data;
	Node2 lt, rt;
	
	public Node2(int val) {
		data = val;
		lt = rt = null;
	}
}

class Ex07_05_Review {
	//설명
	//아래 그림과 같은 이진트리의 전위순회와 후위순회를 연습해 보세요.
	//         1
	//     2       3
	//   4   5   6   7
	//전위순회 출력 : 1 2 4 5 3 6 7
	//중위순회 출력 : 4 2 5 1 6 3 7
	//후위순회 출력 : 4 5 2 6 7 3 1
	Node2 root;
	
	public void DFS(Node2 node) {
		if(node == null) return;
		else {
			DFS(node.lt);
			DFS(node.rt);
			System.out.print(node.data + " ");
		}
	}
	
	public static void main(String[] args) {
		Ex07_05_Review tree = new Ex07_05_Review();
		tree.root = new Node2(1);
		tree.root.lt = new Node2(2);
		tree.root.rt = new Node2(3);
		tree.root.lt.lt = new Node2(4);
		tree.root.lt.rt = new Node2(5);
		tree.root.rt.lt = new Node2(6);
		tree.root.rt.rt = new Node2(7);
		tree.DFS(tree.root);
	}
}
