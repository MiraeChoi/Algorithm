package h_dfs_n_bfs;

import java.util.ArrayList;
import java.util.Scanner;

class Ex08_08 {
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
