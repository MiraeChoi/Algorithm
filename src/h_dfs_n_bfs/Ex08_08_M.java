package h_dfs_n_bfs;

import java.util.Scanner;

class Ex08_08_M {
	static int n, f;
	static int[] b, p, ch;
	boolean flag = false;
	boolean flag2 = false;
	
	public int nCr(int pn, int pi) {
		if(pi == 0 || pn == pi) return 1;
		if(pi == 1) return pn;
		else return nCr(pn-1, pi-1) + nCr(pn-1, pi);
	}
	
	public void arr(int ai) {
		if(ai == n) {
			DFS(0, 0);
			return;
		}
		else {
			for(int i = 0; i < n; i++) {
				if(ch[i] == 0) {
					ch[i] = 1;
					b[i] = ai + 1;
					arr(ai + 1);
					ch[i] = 0;
				}
			}
		}
	}
	
	public void DFS(int L, int sum) {
		if(flag) return;
		if(L == n) {
			if(sum == f) {
				for(int i = 0; i < n; i++) System.out.print(b[i] + " ");
				flag = true;
			}
			arr(0);
		} else {
			DFS(L+1, sum+(b[L]*p[L]));
		}
	}
	
	public static void main(String[] args) {
		Ex08_08_M T = new Ex08_08_M();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		f = kb.nextInt();
		b = new int[n];
		p = new int[n];
		ch = new int[n];
		T.arr(0);
		for(int i = 0; i < n; i++) p[i] = T.nCr(n-1, i);
		T.DFS(0, 0);
	}
}
