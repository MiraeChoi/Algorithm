package k_backjoon;

import java.io.IOException;

class A9663_3 {
	private static int N, answer;
	private static int[] arr;
	
	private static void nQueen(int L) {
		if(L == N) answer++;
		else {
			for(int i = 0; i < N; i++) {
				arr[L] = i;
				if(canDo(L)) nQueen(L + 1);
			}
		}
	}
	
	private static boolean canDo(int col) {
		for(int i = 0; i < col; i++) {
			if(arr[col] == arr[i]) return false;
			else if(Math.abs(col - i) == Math.abs(arr[col] - arr[i])) return false;
		}
		return true;
	}
	
	public static void main(String[] args) throws IOException {
		N = readInt();
		arr = new int[N];
		nQueen(0);
		System.out.println(answer);
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