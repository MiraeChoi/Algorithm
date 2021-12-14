package g_recursive_tree_graph;

class Ex07_01_T {
	public void DFS(int n) {
		if(n == 0) return;
		else {
			DFS(n-1);
			System.out.print(n + " ");
		}
	}
	
	public static void main(String[] args) {
		Ex07_01_T T = new Ex07_01_T();
		T.DFS(3);
	}
}

