package h_dfs_n_bfs;

import java.util.ArrayList;
import java.util.Scanner;

class Ex08_04 {
	//설명
	//1부터 N까지 번호가 적힌 구슬이 있습니다. 이중 중복을 허락하여 M번을 뽑아 일렬로 나열하는 방법을 모두 출력합니다.
	
	//입력
	//첫 번째 줄에 자연수 N(3<=N<=10)과 M(2<=M<=N)이 주어집니다.
	
	//출력
	//첫 번째 줄에 결과를 출력합니다.
	//출력 순서는 사전순으로 오름차순으로 출력합니다.
	static int n, m;
	static ArrayList<String> ans = new ArrayList<>();
	static int[] ch;
	static int[] arr;
	
	public void DFS(int L) {
		if(L == n+1) {
			String tmp = "";
			for(int i = 0; i < n; i++) {
				if(ch[i+1] == 1) tmp += (arr[i] + " ");
//				else tmp += (1 + " ");
			}
			ans.add(tmp);
		} else {
			ch[L] = 1;
			DFS(L+1);
			ch[L] = 0;
			DFS(L+1);
		}
	}
	
	public static void main(String[] args) {
		Ex08_04 T = new Ex08_04();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		ch = new int[n+1];
		arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = i+1;
		T.DFS(1);
		for(int i = 0; i < ans.size(); i++) System.out.println(ans.get(i));
	}
}