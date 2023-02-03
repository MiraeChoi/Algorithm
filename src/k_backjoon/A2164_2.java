package k_backjoon;

import java.io.IOException;

class A2164_2 {
	public static void main(String[] args) throws IOException {
		int N = read();
		int i = 1;
		while(i < N) i <<= 1;
		System.out.println(i == 1 ? 1 : (N - (i >> 1)) << 1);
	}

	private static int read() throws IOException {
    	int c, n = System.in.read() & 15;
        while ((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
        return n;
	}
}