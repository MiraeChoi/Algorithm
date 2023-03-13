package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A2485_2 {
	private static int GCD(int a, int b) {
		if(b == 0) return a;
		return GCD(b, a % b);
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] tree = new int[N - 1];
		int input = Integer.parseInt(br.readLine());
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < tree.length; i++) {
			int cur = Integer.parseInt(br.readLine());
			tree[i] = cur - input;
			input = cur;
		}
		for(int i = 1; i < tree.length; i++) {
			min = Math.min(min, GCD(tree[i], tree[i - 1]));
		}
		int answer = 0;
		for(int i = 0; i < tree.length; i++) {
			answer += (tree[i] - 1) / min;
		}
		System.out.print(answer);
	}
}