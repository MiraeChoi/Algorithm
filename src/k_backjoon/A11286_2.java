package k_backjoon;

import java.io.IOException;
import java.util.PriorityQueue;

class A11286_2 {
	//맞았습니다!! 이클립스에서는 readInt 대신 BufferedReader 쓰면 정답이 나와용.
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
		PriorityQueue<Integer> pQ = new PriorityQueue<>((o1, o2) -> {
			int abs1 = Math.abs(o1);
			int abs2 = Math.abs(o2);
			if(abs1 == abs2) return o1 > o2 ? 1 : -1;
			return abs1 - abs2;
		});
		StringBuilder sb = new StringBuilder();
		while(N-- > 0) {
			int num = readInt();
			if(num == 0) sb.append(pQ.isEmpty() ? 0 : pQ.poll()).append('\n');
			else pQ.add(num);
		}
		System.out.println(sb);
	}
}