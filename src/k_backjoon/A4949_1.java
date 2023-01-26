package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class A4949_1 {
	//맞았습니다!!
	private static String check(String str) {
		Stack<Character> stack = new Stack<>();
		for(int i = 0; i < str.length(); i++) {
			char cur = str.charAt(i);
			if(cur == '(' || cur == '[') stack.push(cur);
			else if(cur == ')') {
				if(stack.isEmpty() || stack.pop() != '(') return "no";
			}
			else if(cur == ']') {
				if(stack.isEmpty() || stack.pop() != '[') return "no";
			}
		}
		if(!stack.isEmpty()) return "no";
		else return "yes";
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true) {
			String str = br.readLine();
			if(str.equals(".")) break;
			sb.append(check(str)).append("\n");
		}
		System.out.println(sb);
	}
}