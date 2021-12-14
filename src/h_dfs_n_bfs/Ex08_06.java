package h_dfs_n_bfs;

import java.util.Scanner;

class Ex08_06 {
	static int[] answer;
	
	public void DFS(int L, int n, int m, int[] arr) {
		if(L == m) {
			for(int i = 0; i < m; i++) {
				for(int j = 0; j < i; j++) {
					if(answer[i] == answer[j]) return;
				}
			}
			for(int x : answer) System.out.print(x + " ");
			System.out.println();
		} else {
			for(int i = 0; i < n; i++) {
				answer[L] = arr[i];
				DFS(L+1, n, m, arr);
			}
		}
	}
	
	public static void main(String[] args) {
		Ex08_06 T = new Ex08_06();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] arr = new int[n];
		answer = new int[m];
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		T.DFS(0, n, m, arr);
	}
}
