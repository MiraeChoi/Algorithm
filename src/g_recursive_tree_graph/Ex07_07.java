package g_recursive_tree_graph;

class Tree {
	int data;
	Tree lt, rt;
	
	public Tree(int n) {
		data = n;
		lt = rt = null;
	}
}

class Ex07_07 {
	//설명
	//아래 그림과 같은 이진트리를 레벨탐색 연습하세요.
	//         1
	//     2       3
	//   4   5   6   7
	//레벨 탐색 순회 출력 : 1 2 3 4 5 6 7
	Tree root;
	
	public void BFS(Tree tree) {
		
	}
	
	public static void main(String[] args) {
		Ex07_07 tree = new Ex07_07();
		tree.root = new Tree(1);
		tree.root.lt = new Tree(2);
		tree.root.rt = new Tree(3);
		tree.root.lt.lt = new Tree(4);
		tree.root.lt.rt = new Tree(5);
		tree.root.rt.lt = new Tree(6);
		tree.root.rt.rt = new Tree(7);
	}
}
