package h_dfs_n_bfs;

import java.util.Arrays;
import java.util.Scanner;

class Ex08_05 {
	static int n, m, answer = Integer.MAX_VALUE;
	static int[] coin;
	boolean flag = false;
	
	public void DFS(int L, int sum) {
		System.out.println("sum : " + sum + "/ L : " + L);
		if(flag) return;
		if(sum > m) return;
		if(sum == m) {
			answer = Math.min(answer, L);
			flag = true;
		}
		else {
			for(int i = coin.length-1; i >= 0; i--) {
				DFS(L+1, sum + coin[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		Ex08_05 T = new Ex08_05();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		coin = new int[n];
		for(int i = 0; i < n; i++) coin[i] = kb.nextInt();
		Arrays.sort(coin);
		m = kb.nextInt();
		T.DFS(0, 0);
		System.out.println(answer);
	}
}
