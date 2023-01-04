package k_backjoon;

import java.io.IOException;

class A15652 {
	//맞았습니다!!
	static int N, M;
	static int[] arr;
	static StringBuilder sb = new StringBuilder();
	
	private static void DFS(int idx, int L) {
		if(L == M) {
			for(int x : arr) sb.append(x).append(' ');
			sb.append('\n');
		} else {
			for(int i = idx; i < N; i++) {
				arr[L] = i + 1;
				DFS(i, L + 1);
				idx++;
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		N = readInt();
		M = readInt();
		arr = new int[M];
		DFS(0, 0);
		System.out.println(sb);
	}
	
	private static int readInt() throws IOException {
		int n = 0;
		while(true) {
			int input = System.in.read();
			if(input <= 32) return n;
			else n = (n << 3) + (n << 1) + (input & 15);
		}
	}
}