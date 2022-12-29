package k_backjoon;

import java.io.IOException;

class A15469_3 {
	static int N, M;
	static boolean[] check;
	static int[] arr;
	static StringBuilder sb = new StringBuilder();
	
	static void DFS(int L) {
		if(L == M) {
			for(int x : arr) sb.append(x).append(' ');
			sb.append('\n');
		} else {
			for(int i = 0; i < N; i++) {
				if(check[i] == false) {
					check[i] = true;
					arr[L] = i + 1;
					DFS(L+1);
					check[i] = false;
				}
			}
		}
	}
	
	static int readInt() throws IOException {
		int n = 0;
		while(true) {
			int input = System.in.read();
			if(input <= 32) return n;
			else n = (n << 3) + (n << 1) + (input & 15);
		}
	}
	
	public static void main(String[] args) throws IOException {
		N = readInt();
		M = readInt();
		check = new boolean[N];
		arr = new int[M];
		DFS(0);
		System.out.println(sb);
	}
}