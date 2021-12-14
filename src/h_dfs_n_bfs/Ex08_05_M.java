package h_dfs_n_bfs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Ex08_05_M {
	static int n, m, answer = Integer.MAX_VALUE;
	static Integer[] arr;
	
	public void DFS(int L, int sum) {
		if(sum > m) return;
		if(L >= answer) return;
		if(sum == m) answer = Math.min(answer, L);
		else {
			for(int i = 0; i < arr.length; i++) {
				DFS(L+1, sum + arr[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		Ex08_05_M T = new Ex08_05_M();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		arr = new Integer[n];
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		Arrays.sort(arr, Collections.reverseOrder());
		m = kb.nextInt();
		T.DFS(0, 0);
		System.out.println(answer);
	}
}
