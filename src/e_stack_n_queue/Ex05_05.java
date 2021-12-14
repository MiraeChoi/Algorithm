package e_stack_n_queue;

import java.util.Scanner;
import java.util.Stack;

class Ex05_05 {
	public int solution(String str) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		char tmp = '(';
		int cut = 0;
		
		for(char x : str.toCharArray()) {
			if(x == '(') {
				answer++;
				cut++;
			} else if(x == ')') {
				cut--;
				
				if(x != tmp) {
					answer--;
					stack.push(cut);
				}
			}
			tmp = x;
		}
		
		for(int i = 0; i < stack.size(); i++) answer += stack.get(i);
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex05_05 T = new Ex05_05();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}
