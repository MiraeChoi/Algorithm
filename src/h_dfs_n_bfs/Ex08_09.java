package h_dfs_n_bfs;

import java.util.Scanner;

class Ex08_09 {
	static int n, m;
	static int[] ch, arr;
	
	public void DFS(int L) {
		if(L == m) {
			for(int i = 0; i < m; i++) {
				for(int j = 0; j < i; j++) {
					if(arr[i] == arr[j] || arr[i] < arr[j]) return;
				}
			}
			for(int x : arr) System.out.print(x + " ");
			System.out.println();
		} else {
			for(int i = 1; i <= n; i++) {
				if(ch[L] == 0) {
					ch[L] = 1;
					arr[L] = i;
					DFS(L+1);
					ch[L] = 0;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Ex08_09 T = new Ex08_09();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		arr = new int[m];
		ch = new int[n];
		T.DFS(0);
	}
}
