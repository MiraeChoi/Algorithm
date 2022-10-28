package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A2566 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int x = 0, y = 0;
		int MAX = Integer.MIN_VALUE;
		for(int i = 1; i <= 9; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 1; j <= 9; j++) {
				int tmp = Integer.parseInt(st.nextToken());
				if(tmp > MAX) {
					MAX = tmp;
					x = i; y = j;
				}
			}
		}
		System.out.println(MAX);
		System.out.println(x + " " + y);
	}
}