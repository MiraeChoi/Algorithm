package k_backjoon;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

class A11866_3 {
	//standard
	public static void main(String[] args) throws IOException {
		int N = read(), K = read();
		Queue<Integer> Q = new LinkedList<>();
		for(int i = 1; i <= N; i++) Q.offer(i);
		StringBuilder sb = new StringBuilder();
		sb.append('<');
		while(!Q.isEmpty()) {
			for(int i = 0; i < K-1; i++) Q.offer(Q.poll());
			sb.append(Q.poll());
			if(!Q.isEmpty()) sb.append(',').append(' ');
		}
		sb.append('>');
		System.out.print(sb);
	}
	
	private static int read() throws IOException {
    	int c, n = System.in.read() & 15;
        while ((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
        return n;
	}
}