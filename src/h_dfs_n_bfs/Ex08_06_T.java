package h_dfs_n_bfs;

import java.util.Scanner;

class Ex08_06_T {
	//설명
	//10 이하의 N개의 자연수가 주어지면 이중 M개를 뽑아 일렬로 나열하는 방법을 모두 출력합니다.
	
	//입력
	//첫 번째 줄에 자연수 N(3<=N<=10)과 M(2<=M<=N)이 주어집니다.
	//두 번째 줄에 N개의 자연수가 오름차순으로 주어집니다.
	
	//출력
	//첫 번째 줄에 결과를 출력합니다.
	//출력 순서는 사전 순으로 오름차순으로 출력합니다.
	static int[] pm, ch, arr;
	static int n, m;
	
	public void DFS(int L) {
		if(L == m) {
			for(int x : pm) System.out.print(x + " ");
			System.out.println();
		} else {
			for(int i = 0; i < n; i++) {
				if(ch[i] == 0) {
					ch[i] = 1;
					pm[L] = arr[i];
					DFS(L+1);
					ch[i] = 0;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Ex08_06_T T = new Ex08_06_T();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		ch = new int[n];
		pm = new int[m];
		T.DFS(0);
	}
}
