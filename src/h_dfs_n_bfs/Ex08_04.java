package h_dfs_n_bfs;

import java.util.ArrayList;
import java.util.Scanner;

class Ex08_04 {
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