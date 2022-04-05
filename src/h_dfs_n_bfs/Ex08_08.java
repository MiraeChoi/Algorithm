package h_dfs_n_bfs;

import java.util.ArrayList;
import java.util.Scanner;

class Ex08_08 {
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
	static int n, f, len = 1;
	static int[] pm, ch, arr;
	static ArrayList<int[]> list = new ArrayList<>();
	boolean flag = false;
	int answer = 0;
	
	public void sum(int[] arr) {
		if(flag) return;
		int[] tmp = new int[arr.length-1];
		
		for(int i = 0; i < tmp.length; i++) {
			tmp[i] = arr[i] + arr[i+1];
		}
		if(tmp.length == 1) {
			answer = tmp[0];
			if(answer == f) flag = true;
		}
		else sum(tmp);
	}
	
	public void DFS(int L) {
		if(flag) return;
		if(L == n) {
			sum(pm);
			if(answer == f) {
				for(int x : pm) System.out.print(x + " ");
			}
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
		Ex08_08 T = new Ex08_08();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		f = kb.nextInt();
		arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = i+1;
		ch = new int[n];
		pm = new int[n];
		for(int i = n; i > 0; i--) {
			len *= i;
		}
		T.DFS(0);
	}
}
