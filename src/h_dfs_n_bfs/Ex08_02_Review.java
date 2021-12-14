package h_dfs_n_bfs;

import java.util.Scanner;

class Ex08_02_Review {
	static int answer = 0, c, n;
	static int[] arr;
	
	public void DFS(int L, int sum) {
		if(sum > c) return;
		if(L == n) answer = Math.max(answer, sum);
		else {
			DFS(L+1, sum + arr[L]);
			DFS(L+1, sum);
		}
	}
	
	public static void main(String[] args) {
		Ex08_02_Review T = new Ex08_02_Review();
		Scanner kb = new Scanner(System.in);
		c = kb.nextInt();
		n = kb.nextInt();
		arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		T.DFS(0, 0);
		System.out.println(answer);
	}
}
