package h_dfs_n_bfs;

import java.util.Scanner;

class Ex08_01_M {
	static String answer = "NO";
	static int n;
	static int[] arr;
	static int[] ch;
	static int sum;
	
	public void DFS(int L) {
		if(L == n) {
			int cnt = 0;
			for(int i = 0; i < n; i++) if(ch[i] == 1) cnt += arr[i];
			if(sum - cnt == cnt) {
				answer = "YES";
				return;
			}
		} else {
			ch[L] = 1;
			DFS(L+1);
			ch[L] = 0;
			DFS(L+1);
		}
	}
	
	public static void main(String[] args) {
		Ex08_01_M T = new Ex08_01_M();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		arr = new int[n];
		ch = new int[n];
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		for(int i = 0; i < n; i++) sum += arr[i];
		T.DFS(0);
		System.out.println(answer);
	}
}
