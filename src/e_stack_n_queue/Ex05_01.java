package e_stack_n_queue;

import java.util.Scanner;

class Ex05_01 {
	public String solution(String s) {
		String answer = "NO";
		if(s.charAt(0) == ')' || s.charAt(s.length()-1) == '(') return answer;
		
		int cnt = 0;
		
		for(char x : s.toCharArray()) {
			if(x == '(') cnt++;
			if(x == ')') cnt--;
		}
		
		if(cnt == 0) answer = "YES";
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex05_01 T = new Ex05_01();
		Scanner kb = new Scanner(System.in);
		String s = kb.next();
		System.out.println(T.solution(s));
	}
}
