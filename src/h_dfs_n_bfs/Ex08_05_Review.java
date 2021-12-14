package h_dfs_n_bfs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Ex08_05_Review {
	static int n, m, answer = Integer.MAX_VALUE;
	static Integer[] arr;
	
	public void DFS(int L, int sum) {
		System.out.println("L / sum : " + L + " / " + sum);
		if(sum > m) return;
		if(L >= answer) return;
		if(sum == m) {
			answer = Math.min(answer, L);
			System.out.println("¡Úanswer " + answer + "¡Ú");
		}
		else for(int i = 0; i < n; i++) DFS(L+1, sum + arr[i]);
	}
	
	public static void main(String[] args) {
		Ex08_05_Review T = new Ex08_05_Review();
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
