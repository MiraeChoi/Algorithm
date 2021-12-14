package h_dfs_n_bfs;

import java.util.Scanner;

class Ex08_02 {
	static int answer;
	static int c, n;
	static int[] arr;
	
	public void DFS(int L, int sum) {
		if(sum > c) return;
		if(L == n) {
			answer = Integer.max(answer, sum);
		}
		else {
			Integer.max(answer, sum + arr[L]);
			DFS(L+1, sum + arr[L]);
			Integer.max(answer, sum);
			DFS(L+1, sum);
		}
	}
	
	public static void main(String[] args) {
		Ex08_02 T = new Ex08_02();
		Scanner kb = new Scanner(System.in);
		c = kb.nextInt();
		n = kb.nextInt();
		arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		T.DFS(0, 0);
		System.out.println(answer);
	}
}
