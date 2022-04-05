package h_dfs_n_bfs;

import java.util.Scanner;

class Ex08_06 {
	//설명
	//10 이하의 N개의 자연수가 주어지면 이중 M개를 뽑아 일렬로 나열하는 방법을 모두 출력합니다.
	
	//입력
	//첫 번째 줄에 자연수 N(3<=N<=10)과 M(2<=M<=N)이 주어집니다.
	//두 번째 줄에 N개의 자연수가 오름차순으로 주어집니다.
	
	//출력
	//첫 번째 줄에 결과를 출력합니다.
	//출력 순서는 사전 순으로 오름차순으로 출력합니다.
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
