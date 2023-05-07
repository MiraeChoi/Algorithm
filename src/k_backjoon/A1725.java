package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class A1725 {
	//맞았습니다!!
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n =  Integer.parseInt(br.readLine());
		int[] square = new int[n + 2];
		for(int i = 1; i < n + 1; i++) square[i] = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		stack.push(0);
		int answer = 0;
		for(int i = 1; i <= n + 1; i++) {
			while(!stack.isEmpty()) {
				int top = stack.peek();
				System.out.println("top : " + top);
				if(square[top] <= square[i]) break;
				stack.pop();
				answer = Math.max(answer, square[top] * (i - stack.peek() - 1));
			}
			stack.push(i);
			System.out.println(stack);
		}
		System.out.print(answer);
	}
}