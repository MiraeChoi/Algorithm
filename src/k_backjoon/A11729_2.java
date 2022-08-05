package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A11729_2 {
	static StringBuilder sb = new StringBuilder();
	
	static void hanoi(int n, int s, int e) {
		if(n == 0) return;
		hanoi(n-1, s, 6-s-e);
		sb.append(s).append(' ').append(e).append('\n');
		hanoi(n-1, 6-s-e, e);
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		sb.append((int)(Math.pow(2, n) - 1)).append('\n');
		hanoi(n, 1, 3);
		System.out.println(sb);
		br.close();
	}
}
