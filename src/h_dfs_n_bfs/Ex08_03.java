package h_dfs_n_bfs;

import java.util.Scanner;

class Ex08_03 {
	static int answer = 0, n, m;
	static int[][] arr;
	
	public void DFS(int L, int min, int sum) {
		if(min > m) return;
		if(L == n) answer = Math.max(answer, sum);
		else {
			DFS(L+1, min + arr[L][1], sum + arr[L][0]);
			DFS(L+1, min, sum);
		}
	}
	
	public static void main(String[] args) {
		Ex08_03 T = new Ex08_03();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		arr = new int[n][2];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < 2; j++) arr[i][j] = kb.nextInt();
		}
		T.DFS(0, 0, 0);
		System.out.println(answer);
	}
}
