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
	//설명
	//아래 그림과 같은 이진트리에서 루트 노드 1에서 말단 노드까지의 길이 중 가장 짧은 길이를 구하는 프로그램을 작성하세요.
	//각 경로의 길이는 루트 노드에서 말단 노드까지 가는데 이동하는 횟수, 즉 간선(에지)의 개수를 길이로 하겠습니다.
	//         1
	//     2       3
	//   4   5
	//가장 짧은 길이는 3번 노드까지의 길이인 1이다.
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
