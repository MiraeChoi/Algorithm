package h_dfs_n_bfs;

import java.util.Scanner;

class Ex08_06_M {
	//설명
	//10 이하의 N개의 자연수가 주어지면 이중 M개를 뽑아 일렬로 나열하는 방법을 모두 출력합니다.
	
	//입력
	//첫 번째 줄에 자연수 N(3<=N<=10)과 M(2<=M<=N)이 주어집니다.
	//두 번째 줄에 N개의 자연수가 오름차순으로 주어집니다.
	
	//출력
	//첫 번째 줄에 결과를 출력합니다.
	//출력 순서는 사전 순으로 오름차순으로 출력합니다.
	static int n, m;
	static int[] arr, ch, pm;
	
	public void DFS(int L) {
		if(L == m) {
			for(int i = 0; i < m; i++) {
				for(int j = 0; j < i; j++) {
					if(pm[i] == pm[j]) return;
				}
			}
			for(int x : pm) System.out.print(x + " ");
			System.out.println();
		} else {
			for(int i = 0; i < n; i++) {
				ch[L] = 1;
				pm[L] = arr[i];
				DFS(L+1);
				ch[L] = 0;
			}
		}
	}
	
	public static void main(String[] args) {
		Ex08_06_M T = new Ex08_06_M();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		arr = new int[n];
		ch = new int[n];
		pm = new int[m];
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		T.DFS(0);
	}
}
 