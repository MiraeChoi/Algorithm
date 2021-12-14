package h_dfs_n_bfs;

import java.util.ArrayList;
import java.util.Scanner;

class Ex08_01 {
	static String answer = "NO";
	static int n;
	static ArrayList<Integer> a = new ArrayList<>();
	static ArrayList<Integer> b = new ArrayList<>();
	static int[] ch;
	static int[] arr;
	
	public void DFS(int L) {
		if(L == n) {
			for(int i = 0; i < ch.length; i++) if(ch[i] == 1) a.add(arr[i]);
			for(int i = 0; i < ch.length; i++) if(ch[i] == 0) b.add(arr[i]);
			
			int ca = 0; int cb = 0;
			for(int i = 0; i < a.size(); i++) ca += a.get(i);
			for(int i = 0; i < b.size(); i++) cb += b.get(i);
			
			for(int i = 0; i < a.size(); i++) {
				System.out.print(a.get(i) + "/");
			}
			System.out.println();
			System.out.println("ca : " + ca);
			for(int i = 0; i < b.size(); i++) {
				System.out.print(b.get(i) + "/");
			}
			System.out.println();
			System.out.println("cb : " + cb);
			
			if(ca == cb) {
				answer = "YES";
				System.out.println("-------------------------------------------");
				a.clear(); b.clear();
				return;
			}
			a.clear(); b.clear();
		} else {
			ch[L] = 1;
			DFS(L+1);
			ch[L] = 0;
			DFS(L+1);
		}
	}
	
	public static void main(String[] args) {
		Ex08_01 T = new Ex08_01();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		ch = new int[n];
		arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		T.DFS(0);
		System.out.println(answer);
	}
}
