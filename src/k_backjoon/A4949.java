package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class A4949 {
	private static Stack<Integer> stack = new Stack<>();
	//Æ²·È½À´Ï´Ù
	private static boolean check(String str) {
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '(') stack.push(1);
			else if(str.charAt(i) == '[') stack.push(2);
			else if(str.charAt(i) == ')') {
				if(stack.isEmpty() || stack.pop() != 1) return false;
			}
			else if(str.charAt(i) == ']') {
				if(stack.isEmpty() || stack.pop() != 2) return false;
			}
		}
		if(!stack.isEmpty()) return false;
		else return true;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true) {
			String str = br.readLine();
			if(str.equals(".")) break;
			else {
				if(check(str)) sb.append("yes").append("\n");
				else sb.append("no").append("\n");
			}
		}
		System.out.println(sb);
	}
}