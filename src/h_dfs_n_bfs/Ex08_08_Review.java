package h_dfs_n_bfs;

import java.util.Scanner;

class Ex08_08_Review {
	//설명
	//가장 윗줄에 1부터 N까지의 숫자가 한 개씩 적혀 있다. 그리고 둘째 줄부터 차례대로 파스칼의 삼각형처럼 위의 두개를 더한 값이 저장되게 된다.
	//예를 들어 N이 4 이고 가장 윗 줄에 3 1 2 4 가 있다고 했을 때, 다음과 같은 삼각형이 그려진다.
	// 3 1 2 4
	//  4 3 6
	//   7 9
	//    16
	//N과 가장 밑에 있는 숫자가 주어져 있을 때 가장 윗줄에 있는 숫자를 구하는 프로그램을 작성하시오.
	//단, 답이 여러가지가 나오는 경우에는 사전순으로 가장 앞에 오는 것을 출력하여야 한다.

	//입력
	//첫째 줄에 두개의 정수 N(1≤N≤10)과 F가 주어진다.
	//N은 가장 윗줄에 있는 숫자의 개수를 의미하며 F는 가장 밑에 줄에 있는 수로 1,000,000 이하이다.

	//출력
	//첫째 줄에 삼각형에서 가장 위에 들어갈 N개의 숫자를 빈 칸을 사이에 두고 출력한다.
	//답이 존재하지 않는 경우는 입력으로 주어지지 않는다.
	static int n, f;
	static int[] b, p, ch;
	static int[][] dy = new int[35][35];
	boolean flag = false;
	
	public int combi(int n, int r) {
		if(dy[n][r] > 0) return dy[n][r];
		if(r == 0 || r == n) return 1;
		else return dy[n][r] = combi(n-1, r) + combi(n-1, r-1);
	}
	
	public void DFS(int L, int sum) {				//L = 0, sum = 0	L = 1, sum = 1			L = 2, sum = 7					L = 3, sum = 16				L = 4, sum = 20		L = 3, sum = 16		L = 2, sum = 7			L = 3, sum = 19						L = 4, sum = 22		
		if(flag) return;
		if(L == n) {																																		//4 == n																							4 == n
			if(sum == f) {																																	//20 != 16																							22 != 16
				for(int x : p) System.out.print(x + " ");
				flag = true;
			}
		} else {
			for(int i = 1; i <= n; i++) {			//i = 1				i = 1	i = 2			i = 1	i = 2	i = 3			i = 1 ... i = 4														i = 3	i = 4			i = 1	i = 2	i = 3
				if(ch[i] == 0) {
					ch[i] = 1;						//ch[1] = 1					ch[2] = 1						ch[3] = 1				  ch[4] = 1															ch[4] = 1						ch[3] = 1
					p[L] = i;						//p[0] = 1					p[1] = 2						p[2] = 3				  p[3] = 4															p[2] = 4						p[3] = 3
					DFS(L+1, sum+(b[L] * p[L]));	//DFS(0+1, 0+1*1)			DFS(1+1, 1+3*2)					DFS(2+1, 7+3*3)			  DFS(3+1, 16+1*4)													DFS(2+1, 7+3*4)					DFS(3+1, 19+1*3)
					ch[i] = 0;																																					//ch[4] = 0			ch[3] = 0
				}																																			//p = {1, 2, 3, 4}																					p = {1, 2, 4, 3}
			}
		}
	}
	
	public static void main(String[] args) {
		Ex08_08_Review T = new Ex08_08_Review();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		f = kb.nextInt();
		b = new int[n];
		p = new int[n];
		ch = new int[n+1];
		for(int i = 0; i < n; i++) {
			b[i] = T.combi(n-1, i);
			System.out.print(b[i] + " ");
		}
		System.out.println();
		T.DFS(0, 0);
	}
}
