package k_backjoon;

import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;

class A11279_2 {
	//맞았습니다!! but 이클립스 상에서는 결과가 다르게 나옴
	static int readInt() throws IOException {
		int n = 0;
		boolean isNegative = false;
		while(true) {
			int input = System.in.read();
			if(input <= 32) return isNegative ? n * -1 : n;
			else if(input == '-') isNegative = true;
			else n = (n << 3) + (n << 1) + (input & 15);
		}
	}
	
	public static void main(String[] args) throws IOException {
		int N = readInt();
		PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
		StringBuilder sb = new StringBuilder();
		while(N-- > 0) {
			int num = readInt();
			if(num > 0) pQ.add(num);
			else sb.append(pQ.isEmpty() ? 0 : pQ.poll()).append('\n');
		}
		System.out.println(sb);
	}
}