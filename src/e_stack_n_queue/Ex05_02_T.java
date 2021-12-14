package e_stack_n_queue;

import java.util.Scanner;
import java.util.Stack;

class Ex05_02_T {
	public String solution(String str) {
		String answer = "";
		Stack<Character> stack = new Stack<>();
		
		for(char x : str.toCharArray()) {
			if(x == ')') while(stack.pop() != '(');
			else stack.push(x);
		}
		
		for(int i = 0; i < stack.size(); i++) answer += stack.get(i);
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex05_02_T T = new Ex05_02_T();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}
