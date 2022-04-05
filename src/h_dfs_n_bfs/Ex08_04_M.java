package h_dfs_n_bfs;

import java.util.Scanner;

class Ex08_04_M {
	//설명
	//1부터 N까지 번호가 적힌 구슬이 있습니다. 이중 중복을 허락하여 M번을 뽑아 일렬로 나열하는 방법을 모두 출력합니다.
	
	//입력
	//첫 번째 줄에 자연수 N(3<=N<=10)과 M(2<=M<=N)이 주어집니다.
	
	//출력
	//첫 번째 줄에 결과를 출력합니다.
	//출력 순서는 사전순으로 오름차순으로 출력합니다.
	static int n, m;
	static int[] arr;
	
	public void DFS(int L) {
		if(L == m) {
			for(int i = 0; i < m; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		} else {
			for(int i = 0; i < n; i++) {
				arr[L] = i+1;
				DFS(L+1);
			}
		}
	}
	
	public static void main(String[] args) {
		Ex08_04_M T = new Ex08_04_M();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		arr = new int[m];
		T.DFS(0);
	}
}
