package h_dfs_n_bfs;

import java.util.Scanner;

class Ex08_09_Review {
	//설명
	//1부터 N까지 번호가 적힌 구슬이 있습니다. 이중 M개를 뽑는 방법의 수를 출력하는 프로그램을 작성하세요.
	
	//입력
	//첫 번째 줄에 자연수 N(3<=N<=10)과 M(2<=M<=N)이 주어집ㅌ니다.
	
	//출력
	//첫 번째 줄에 결과를 출력합니다.
	//출력 순서는 사전 순으로 오름차순으로 출력합니다.
	static int n, m;
	static int[] combi;
	
	public void DFS(int L, int s) {							//L=0, s=1		L=1, s=2		L=2, s=3	L=1, s=2		L=2, s=3
		if(L == m) {																		//2 == m					2 == m
			for(int x : combi) System.out.print(x + " ");									//syso(1 2)					syso(1 3)
			System.out.println();
		} else {
			for(int i = s; i <= n; i++) {					//i = 1			i = 2						i = 3
				combi[L] = i;								//combi[0] = 1  combi[1] = 2				combi[1] = 3
				DFS(L+1, i+1);								//DFS(0+1, 1+1) DFS(1+1, 2+1)				DFS(1+1, 2+1)
			}
		}
	}
	
	public static void main(String[] args) {
		Ex08_09_Review T = new Ex08_09_Review();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		combi = new int[m];
		T.DFS(0, 1);
	}
}
