package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class A1874 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(br.readLine());
		int idx = 1;
		Stack<Integer> stack = new Stack<>();
		stack.add(idx);
		int cur = 0;
		while(!stack.isEmpty()) {
			for(int i = 1; i <= n; i++) {
				if(arr[cur] != i) {
					stack.push(arr[cur]);
					sb.append('+').append('\n');
				}
				else {
					stack.pop();
					sb.append('-').append('\n');
				}
			}
			cur++;
		}
		System.out.println(sb);
	}
}