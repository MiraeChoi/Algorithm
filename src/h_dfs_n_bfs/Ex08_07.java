package h_dfs_n_bfs;

import java.util.Scanner;

class Ex08_07 {
	//설명
	//nCr = n! / (n-r)!r!
	//로 계산합니다.
	//하지만 여러분은 이 공식을 쓰지않고 다음 공식을 사용하여 재귀를 이용해 조합수를 구해주는 프로그램을 작성하세요.
	//nCr = n-1Cr-1 + n-1Cr

	//입력
	//첫째 줄에 자연수 n(3<=n<=33)과 r(0<=r<=n)이 입력됩니다.

	//출력
	//첫째 줄에 조합수를 출력합니다.
	public int DFS(int n, int r) {
		if(n == 1) return 1;
		if(r == 1) return n;
		if(r == n) return 1;
		else return DFS(n-1, r-1) + DFS(n-1, r);
	}
	
	public static void main(String[] args) {
		Ex08_07 T = new Ex08_07();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int r = kb.nextInt();
		System.out.println(T.DFS(n, r));
	}
}
