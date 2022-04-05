package h_dfs_n_bfs;

import java.util.Scanner;

class Ex08_01_M {
	//설명
	//N개의 원소로 구성된 자연수 집합이 주어지면, 이 집합을 두 개의 부분집합으로 나누었을 때
	//두 부분집합의 원소의 합이 서로 같은 경우가 존재하면 "YES"를 출력하고, 그렇지 않으면 "NO"를 출력하는 프로그램을 작성하세요.
	//둘로 나뉘는 두 부분집합은 서로소 집합이며, 두 부분집합을 합하면 입력으로 주어진 원래의 집합이 되어야 합니다.
	//예를 들어 {1, 3, 5, 6, 7, 10}이 입력되면 {1, 3, 5, 7} = {6, 10} 으로 두 부분집합의 합이 16으로 같은 경우가 존재하는 것을 알 수 있다.
	
	//입력
	//첫 번째 줄에 자연수 N(1<=N<=10)이 주어집니다.
	//두 번째 줄에 집합의 원소 N개가 주어진다. 각 원소는 중복되지 않는다.
	
	//출력
	//첫 번째 줄에 "YES" 또는 "NO"를 출력한다.
	static String answer = "NO";
	static int n;
	static int[] arr;
	static int[] ch;
	static int sum;
	
	public void DFS(int L) {
		if(L == n) {
			int cnt = 0;
			for(int i = 0; i < n; i++) if(ch[i] == 1) cnt += arr[i];
			if(sum - cnt == cnt) {
				answer = "YES";
				return;
			}
		} else {
			ch[L] = 1;
			DFS(L+1);
			ch[L] = 0;
			DFS(L+1);
		}
	}
	
	public static void main(String[] args) {
		Ex08_01_M T = new Ex08_01_M();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		arr = new int[n];
		ch = new int[n];
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		for(int i = 0; i < n; i++) sum += arr[i];
		T.DFS(0);
		System.out.println(answer);
	}
}
