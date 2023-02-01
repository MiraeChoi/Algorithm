package k_backjoon;

import java.io.IOException;

class A1874_2 {
	public static void main(String[] args) throws IOException {
		int n = read();
		int[] stack = new int[n];
		int num = 0, top = -1;
		StringBuilder sb = new StringBuilder();
		final String PUSH = "+\n", POP = "-\n";
		
		for(int i = 0; i < n; i++) {
			int k = read();
			while(num < k) {
				stack[++top] = ++num;
				sb.append(PUSH);
			}
			if(stack[top--] != k) {
				num = 0;
				break;
			}
			sb.append(POP);
		}
		if(num == n) {
			while(top--  > -1) sb.append(POP);
			System.out.println(sb);
		} else {
			System.out.println("NO");
		}
	}
	
	static int read() throws IOException {
    	int c, n = System.in.read() & 15;
        while ((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
        return n;
	}
}