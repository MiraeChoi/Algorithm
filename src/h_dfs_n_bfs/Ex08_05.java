package h_dfs_n_bfs;

import java.util.Arrays;
import java.util.Scanner;

class Ex08_05 {
	//설명
	//다음과 같이 여러 단위의 동전들이 주어져 있을때 거스름돈을 가장 적은 수의 동전으로 교환해 주려면 어떻게 주면 되는가?
	//각 단위의 동전은 무한정 쓸 수 있다.
	
	//입력
	//첫 번째 줄에는 동전의 종류개수 N(1<=N<=12)이 주어진다. 두 번째 줄에는 N개의 동전의 종류가 주어지고,
	//그 다음 줄에 거슬러 줄 금액 M(1<=M<=500)이 주어진다.각 동전의 종류는 100원을 넘지 않는다.
	
	//출력
	//첫 번째 줄에 거슬러 줄 동전의 최소개수를 출력한다.
	static int n, m, answer = Integer.MAX_VALUE;
	static int[] coin;
	boolean flag = false;
	
	public void DFS(int L, int sum) {
		System.out.println("sum : " + sum + "/ L : " + L);
		if(flag) return;
		if(sum > m) return;
		if(sum == m) {
			answer = Math.min(answer, L);
			flag = true;
		}
		else {
			for(int i = coin.length-1; i >= 0; i--) {
				DFS(L+1, sum + coin[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		Ex08_05 T = new Ex08_05();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		coin = new int[n];
		for(int i = 0; i < n; i++) coin[i] = kb.nextInt();
		Arrays.sort(coin);
		m = kb.nextInt();
		T.DFS(0, 0);
		System.out.println(answer);
	}
}
