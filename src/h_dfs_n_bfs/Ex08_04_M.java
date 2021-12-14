package h_dfs_n_bfs;

import java.util.Scanner;

class Ex08_04_M {
	static int n, m;
	static int[] arr;
	
	public void DFS(int L) {
		if(L == m) {
			for(int i = 0; i < m; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		} else {
			for(int i = 0; i < n; i++) {
				arr[L] = i+1;
				DFS(L+1);
			}
		}
	}
	
	public static void main(String[] args) {
		Ex08_04_M T = new Ex08_04_M();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		arr = new int[m];
		T.DFS(0);
	}
}
