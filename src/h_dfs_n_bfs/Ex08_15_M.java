package h_dfs_n_bfs;

import java.util.ArrayList;
import java.util.Scanner;

class Point15M {
	int x, y;
	
	public Point15M(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Ex08_15_M {
	static int n, m, answer = Integer.MAX_VALUE, cnt = 0;
	static int[] num;
	static int[][] board;
	static ArrayList<Point15M> hs = new ArrayList<>();
	static ArrayList<Point15M> pz = new ArrayList<>();
	static boolean flag = false;
	
	public void DFS(int sum) {
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
		
		for(int i = 0; i < hs.size(); i++) {
			int hx = hs.get(i).x;
			int hy = hs.get(i).y;
			for(int j = 0; j < pz.size(); j++) {
				if(num[j] == 1) {
					int px = pz.get(j).x;
					int py = pz.get(j).y;
					sum += Math.abs(hx-hy) + Math.abs(px-py);
				}
			}
		}
		answer = Math.min(answer, sum);
		System.out.println("answer : " + answer);
		flag = false;
		num(0);
	}
	
	public void num(int L) {
		if(flag) return;
		if(L == m) {
			flag = true;
		} else {
			for(int i = 0; i < pz.size(); i++) {
				if(L < m && num[L] == 0) {
					num[L] = 1;
					num(L++);
					num[L] = 0;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Ex08_15_M T = new Ex08_15_M();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		board = new int[n+1][n+1];
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				board[i][j] = kb.nextInt();
				if(board[i][j] == 1) hs.add(new Point15M(i, j));
				if(board[i][j] == 2) pz.add(new Point15M(i, j));
			}
		}
		num = new int[pz.size()];
		T.num(0);
		T.DFS(0);
	}
}
