package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class A1874_1 {
	//맞았습니다!!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		int idx = 0;
		int cur = arr[idx];
		for(int i = 1; i <= n; i++) {
			System.out.println("push : " + i);
			stack.push(i);
			sb.append('+').append('\n');
			if(stack.peek() == cur) {
				while(!stack.isEmpty() && stack.peek() == cur) {
					System.out.println("pop : " + stack.peek());
					stack.pop();
					idx++;
					sb.append('-').append('\n');
					if(idx >= n) break;
					cur = arr[idx];
					System.out.println("cur : " + cur);
				}
			}
		}
		if(!stack.isEmpty()) System.out.println("NO");
		else System.out.println(sb);
	}
}