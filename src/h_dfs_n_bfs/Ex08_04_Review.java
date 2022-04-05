package h_dfs_n_bfs;

import java.util.Scanner;

class Ex08_04_Review {
	//설명
	//1부터 N까지 번호가 적힌 구슬이 있습니다. 이중 중복을 허락하여 M번을 뽑아 일렬로 나열하는 방법을 모두 출력합니다.
	
	//입력
	//첫 번째 줄에 자연수 N(3<=N<=10)과 M(2<=M<=N)이 주어집니다.
	
	//출력
	//첫 번째 줄에 결과를 출력합니다.
	//출력 순서는 사전순으로 오름차순으로 출력합니다.
	static int n, m;
	static int[] pm;
	
	public void DFS(int L) {
		if(L == m) {
			for(int x : pm) System.out.print(x + " ");
			System.out.println();
		} else {
			for(int i = 1; i <= n; i++) {
				pm[L] = i;
				DFS(L+1);
			}
		}
	}
	
	public static void main(String[] args) {
		Ex08_04_Review T = new Ex08_04_Review();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		pm = new int[m];
		T.DFS(0);
	}
}
