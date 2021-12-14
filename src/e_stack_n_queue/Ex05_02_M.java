package e_stack_n_queue;

import java.util.Scanner;
import java.util.Stack;

class Ex05_02_M {
	public String solution(String str) {
		String answer = "";
		Stack<Character> stack = new Stack<>();
		int cnt = 0;
		
		for(char x : str.toCharArray()) {
			if(x == '(') cnt++;
			else if(x == ')') {
				cnt--;
				continue;
			}
			
			if(cnt == 0) stack.push(x);
		}
		
		for(char x : stack) {
			answer += x + "";
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex05_02_M T = new Ex05_02_M();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}
