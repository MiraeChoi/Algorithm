package k_backjoon;

import java.io.IOException;

class A15469 {
	static int readInt() throws IOException {
		int n = 0;
		while(true) {
			int input = System.in.read();
			if(input <= 32) return n;
			else n = (n << 3) + (n << 1) + (input & 15);
		}
	}
	
	public static void main(String[] args) throws IOException {
		int N = readInt(), M = readInt();
		//모든 경우를 탐색하는 백트래킹 알고리즘 입문 문제
		
	}
}
