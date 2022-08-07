package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A3003 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] chess = {1, 1, 2, 2, 2, 8};
		for(int i = 0; i < chess.length; i++) {
			int num = Integer.parseInt(st.nextToken());
			System.out.print((chess[i] - num) + " ");
		}
	}
}