package k_backjoon;

import java.io.IOException;

class A9663_2 {
	//맞았습니다!!
	static int N, answer = 0;
	static int[] chess;
	
	private static void queen(int num) {
		if(num == N) {
			answer++;
			return;
		} else {
			for(int i = 0; i < N; i++) {
				chess[num] = i;
				if(possibility(num)) queen(num + 1);
			}
		}
	}
	
	private static boolean possibility(int col) {
		for(int i = 0; i < col; i++) {
			if(chess[col] == chess[i]) return false;
			else if(Math.abs(col - i) == Math.abs(chess[col] - chess[i])) return false;
		}
		return true;
	}
	
	public static void main(String[] args) throws IOException {
		N = readInt();
		chess = new int[N];
		queen(0);
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