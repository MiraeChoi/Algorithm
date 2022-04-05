package h_dfs_n_bfs;

import java.util.Scanner;

class Ex08_09_M {
	//설명
	//1부터 N까지 번호가 적힌 구슬이 있습니다. 이중 M개를 뽑는 방법의 수를 출력하는 프로그램을 작성하세요.
	
	//입력
	//첫 번째 줄에 자연수 N(3<=N<=10)과 M(2<=M<=N)이 주어집ㅌ니다.
	
	//출력
	//첫 번째 줄에 결과를 출력합니다.
	//출력 순서는 사전 순으로 오름차순으로 출력합니다.
	static int n, m;
	static int[] combi;
	
	public void DFS(int L, int sum) {
		if(L == m) {
			for(int x : combi) System.out.print(x + " ");
			System.out.println();
		} else {
			for(int i = 1; i <= n; i++) {
				if(i > L) {
					combi[L] = i;
					DFS(L+1, sum+i);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Ex08_09_M T = new Ex08_09_M();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		combi = new int[m];
		T.DFS(0, 1);
	}
}
