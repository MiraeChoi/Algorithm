package k_backjoon;

import java.io.IOException;
import java.util.PriorityQueue;

class A1927 {
	static int readInt() throws IOException {
		int n = 0;
		while(true) {
			int input = System.in.read();
			if(input <= 32) return n;
			else n = (n << 3) + (n << 1) + (input & 15);
		}
	}
	
	public static void main(String[] args) throws IOException {
		int N = readInt();
		PriorityQueue<Integer> pQ = new PriorityQueue<>();
		StringBuilder sb = new StringBuilder();
		while(N-- > 0) {
			int num = readInt();
			if(num > 0) pQ.add(num);
			else sb.append(pQ.isEmpty() ? 0 : pQ.poll()).append('\n');
		}
		System.out.println(sb);
	}
}