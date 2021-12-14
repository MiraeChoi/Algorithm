package e_stack_n_queue;

import java.util.Scanner;
import java.util.Stack;

public class Ex05_05_Review {
	public int solution(String str) {
		int answer = 0;
		Stack<Character> stack = new Stack<>();
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '(') stack.push('(');
			else {
				stack.pop();
				if(str.charAt(i-1) == '(') answer += stack.size();
				else answer++;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Ex05_05_Review T = new Ex05_05_Review();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}
