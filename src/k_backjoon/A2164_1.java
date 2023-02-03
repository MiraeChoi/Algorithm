package k_backjoon;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

class A2164_1 {
	//맞았습니다!!
	public static void main(String[] args) throws IOException {
		int N = read();
		Queue<Integer> Q = new LinkedList<>();
		for(int i = 0; i < N; i++) Q.offer(i + 1);
		while(Q.size() > 1) {
			Q.poll();
			Q.offer(Q.poll());
		}
		System.out.println(Q.poll());
	}
	
	private static int read() throws IOException {
    	int c, n = System.in.read() & 15;
        while ((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
        return n;
	}
}