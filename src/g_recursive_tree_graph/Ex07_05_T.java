package g_recursive_tree_graph;

class Node {
	int data;
	Node lt, rt;
	
	public Node(int val) {
		data = val;
		lt = rt = null;
	}
}

class Ex07_05_T {
	//����
	//�Ʒ� �׸��� ���� ����Ʈ���� ������ȸ�� ������ȸ�� ������ ������.
	//         1
	//     2       3
	//   4   5   6   7
	//������ȸ ��� : 1 2 4 5 3 6 7
	//������ȸ ��� : 4 2 5 1 6 3 7
	//������ȸ ��� : 4 5 2 6 7 3 1
	Node root;
	
	public void DFS(Node root) {
		if(root == null) return;
		else {
			DFS(root.lt);
			DFS(root.rt);
			System.out.print(root.data + " ");
		}
	}
	
	public static void main(String[] args) {
		Ex07_05_T tree = new Ex07_05_T();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		tree.root.rt.lt = new Node(6);
		tree.root.rt.rt = new Node(7);
		tree.DFS(tree.root);
	}
}
