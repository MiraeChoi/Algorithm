package j_dynamic_programming;

import java.util.Arrays;
import java.util.Scanner;

class Ex10_05_M {
	//설명
	//다음과 같이 여러 단위의 동전들이 주어져 있을때 거스름돈을 가장 적은 수의 동전으로 교환해 주려면 어떻게 주면 되는가?
	//각 단위의 동전은 무한정 쓸 수 있다.
	
	//입력
	//첫 번째 줄에는 동전의 종류개수 N(1<=N<=50)이 주어진다.
	//두 번째 줄에는 N개의 동전의 종류가 주어지고, 그 다음줄에 거슬러 줄 금액 M(1<=M<=500)이 주어진다.
	//각 동전의 종류는 100원을 넘지 않는다.
	
	//출력
	//첫 번째 줄에 거슬러 줄 동전의 최소개수를 출력한다.
	static int[] dy;
	
	public int solution(int n, int m, int[] coin) {
		dy[0] = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 1; j <= m; j++) {
				if(j - coin[i] >= 0) dy[j] = Math.min(dy[j], dy[j - coin[i]] + 1);
			}
		}
		for(int i = 0; i <= m; i++) System.out.print(dy[i] + " ");
		System.out.println();
		return dy[m];
	}
	
	public static void main(String[] args) {
		Ex10_05_M T = new Ex10_05_M();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] coin = new int[n];
		for(int i = 0; i < n; i++) coin[i] = kb.nextInt();
		int m = kb.nextInt();
		dy = new int[m+1];
		Arrays.fill(dy, Integer.MAX_VALUE);
		System.out.println(T.solution(n, m, coin));
	}
}
