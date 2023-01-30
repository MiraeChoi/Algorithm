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
		Stack<Integer> stack = new Stack<>();
		int idx = 0;
		int cur = arr[idx];
		stack.push(1);
		for(int i = 1; i <= n; i++) {
			System.out.println("push : " + i);
			stack.push(i);
			sb.append('+').append('\n');
			if(stack.peek() == cur) {
				while(!stack.isEmpty() && stack.peek() == cur) {
					System.out.println("pop : " + stack.peek());
					stack.pop();
					idx++;
					if(idx > n) break;
					cur = arr[idx];
					System.out.println("cur : " + cur);
					sb.append('-').append('\n');
				}
			}
		}
		for(int i = idx; i < n; i++) {
			if(stack.pop() != arr[i]) {
				System.out.println("NO");
				return;
			} else sb.append('-').append('\n');
		}
		System.out.println(sb);
//		while(true) {
//			if(num > n) {
//				while(!stack.isEmpty() && stack.peek() != cur) {
//					if(stack.peek() == cur) {
//						stack.pop();
//						sb.append('-').append('\n');
//					} else {
//						idx++;
//						if(idx >= n) break;
//						else cur = arr[idx];
//					}
//				}
//				if(stack.isEmpty()) possible = true;
//				break;
//			}
//			if(stack.peek() == cur) {
//				stack.pop();
//				sb.append('-').append('\n');
//			} else {
//				stack.push(num);
//				num++;
//				sb.append('+').append('\n');
//			}
//			idx++;
//			if(idx < n) cur = arr[idx];
//		}
//		if(possible) System.out.println(sb);
//		else System.out.println("NO");
	}
}