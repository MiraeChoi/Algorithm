package e_stack_n_queue;

import java.util.Scanner;
import java.util.Stack;

class Ex05_05_M {
	public int solution(String str) {
		int answer = 0;
		Stack<Character> stack = new Stack<>();
		char tmp = '(';
		
		for(char x : str.toCharArray()) {
			if(x == '(') stack.push(x);
			else {
				stack.pop();
				
				if(x == tmp) answer++;
				else answer += stack.size();
			}
			tmp = x;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex05_05_M T = new Ex05_05_M();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}
