package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

class A10828 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String str = st.nextToken();
			switch(str) {
			case "push" :
				int n = Integer.parseInt(st.nextToken());
				stack.push(n);
				sb.append(n).append('\n');
				return;
			case "pop" :
				sb.append(stack.pop()).append('\n');
				return;
			case "size" :
				sb.append(stack.size()).append('\n');
				return;
			case "empty" :
				sb.append(stack.empty() ? 1 : 0).append('\n');
				return;
			case "top" :
				sb.append(stack.peek()).append('\n');
				return;
			}
		}
		System.out.println(sb);
	}
}
