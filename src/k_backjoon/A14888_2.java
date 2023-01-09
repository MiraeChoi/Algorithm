package k_backjoon;

import java.io.IOException;

class A14888_2 {
	static int[] op = {0, 0, 0, 0};
	
	public static void main(String[] args) throws IOException {
		int N = readInt();
		
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
