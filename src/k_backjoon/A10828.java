package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class A10828 {
	//맞았습니다!!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < N; i++) {
			String str = br.readLine();
			if(str.startsWith("push")) {
				int n = Integer.parseInt((String)str.substring(5));
				stack.push(n);
			} else {
				switch(str) {
				case "pop" :
					sb.append(stack.empty() ? -1 : stack.pop()).append('\n');
					break;
				case "size" :
					sb.append(stack.size()).append('\n');
					break;
				case "empty" :
					sb.append(stack.empty() ? 1 : 0).append('\n');
					break;
				case "top" :
					sb.append(stack.empty() ? -1 : stack.peek()).append('\n');
					break;
				}
			}
		}
		System.out.println(sb);
	}
}