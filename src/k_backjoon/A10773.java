package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class A10773 {
	//맞았습니다!!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		int answer = 0;
		while(K-- > 0) {
			int n = Integer.parseInt(br.readLine());
			if(n > 0) answer += stack.push(n);
			else answer -= stack.pop();
		}
		System.out.println(answer);
	}
}