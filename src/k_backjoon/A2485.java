package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A2485 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] tree = new int[N];
		int min = Integer.MAX_VALUE;
		tree[0] = Integer.parseInt(br.readLine());
		for(int i = 1; i < tree.length; i++) {
			tree[i] = Integer.parseInt(br.readLine());
			min = Math.min(min, tree[i] - tree[i-1]);
		}
		
	}
}