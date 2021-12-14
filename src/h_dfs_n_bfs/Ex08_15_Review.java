package h_dfs_n_bfs;

import java.util.ArrayList;
import java.util.Scanner;

class Point15R {
	int x, y;
	
	public Point15R(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Ex08_15_Review {
	static int n, m, len, answer = Integer.MAX_VALUE;
	static int[] combi;
	static ArrayList<Point15R> hs, pz;
	
	public void DFS(int L, int s) {
		if(L == m) {
			int sum = 0;
			for(Point15R cur : hs) {
				int dis = Integer.MAX_VALUE;
				for(int i : combi) {
					dis = Math.min(dis, Math.abs(cur.x - pz.get(i).x) + Math.abs(cur.y - pz.get(i).y));
				}
				sum += dis;
			}
			answer = Math.min(answer, sum);
		} else {
			for(int i = s; i < len; i++) {
				combi[L] = i;
				DFS(L+1, i+1);
			}
		}
	}
	
	public static void main(String[] args) {
		Ex08_15_Review T = new Ex08_15_Review();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		hs = new ArrayList<>();
		pz = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				int tmp = kb.nextInt();
				if(tmp == 1) hs.add(new Point15R(i, j));
				else if(tmp == 2) pz.add(new Point15R(i, j));
			}
		}
		combi = new int[m];
		len = pz.size();
		T.DFS(0, 0);
		System.out.println(answer);
	}
}
