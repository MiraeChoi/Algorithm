package g_recursive_tree_graph;

class Ex07_06_T {
	static int n;
	static int[] ch;
	
	public void DFS(int L) {
		if(L == n+1) {
			String tmp = "";
			
			for(int i = 1; i <= n; i++) {
				if(ch[i] == 1) tmp += (i + " ");
			}
			
			if(tmp.length() > 0) System.out.println(tmp);
		} else {
			ch[L] = 1;
			DFS(L+1);
			ch[L] = 0;
			DFS(L+1);
		}
	}
	
	public static void main(String[] args) {
		Ex07_06_T T = new Ex07_06_T();
		n = 3;
		ch = new int[n+1];
		T.DFS(1);
	}
}
