package k_backjoon;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

class A1966 {
	public static void main(String[] args) throws IOException {
		int T = read();
		StringBuilder sb = new StringBuilder();
		while(T-- > 0) {
			int N = read(); //문서의 개수
			int M = read(); //몇 번째로 인쇄되는지
			if(N == 1) sb.append(1).append('\n');
			else {
				Queue<Integer> Q = new LinkedList<>();
				for(int i = 0; i < N; i++) Q.offer(read());
				while(true) {
					
				}
			}
		}
		System.out.println(sb);
	}
	
	private static int read() throws IOException {
    	int c, n = System.in.read() & 15;
        while ((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
        return n;
	}
}