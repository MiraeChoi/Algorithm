package h_dfs_n_bfs;

import java.util.Scanner;

class Ex08_09 {
	//설명
	//1부터 N까지 번호가 적힌 구슬이 있습니다. 이중 M개를 뽑는 방법의 수를 출력하는 프로그램을 작성하세요.
	
	//입력
	//첫 번째 줄에 자연수 N(3<=N<=10)과 M(2<=M<=N)이 주어집ㅌ니다.
	
	//출력
	//첫 번째 줄에 결과를 출력합니다.
	//출력 순서는 사전 순으로 오름차순으로 출력합니다.
	static int n, m;
	static int[] ch, arr;
	
	public void DFS(int L) {
		if(L == m) {
			for(int i = 0; i < m; i++) {
				for(int j = 0; j < i; j++) {
					if(arr[i] == arr[j] || arr[i] < arr[j]) return;
				}
			}
			for(int x : arr) System.out.print(x + " ");
			System.out.println();
		} else {
			for(int i = 1; i <= n; i++) {
				if(ch[L] == 0) {
					ch[L] = 1;
					arr[L] = i;
					DFS(L+1);
					ch[L] = 0;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Ex08_09 T = new Ex08_09();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		arr = new int[m];
		ch = new int[n];
		T.DFS(0);
	}
}
