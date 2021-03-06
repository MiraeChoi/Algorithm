package e_stack_n_queue;

import java.util.Scanner;

class Ex05_01 {
	//설명
	//괄호가 입력되면 올바른 괄호이면 “YES", 올바르지 않으면 ”NO"를 출력합니다.
	//(())() 이것은 괄호의 쌍이 올바르게 위치하는 거지만, (()()))은 올바른 괄호가 아니다.
	
	//입력
	//첫 번째 줄에 괄호 문자열이 입력됩니다. 문자열의 최대 길이는 30이다.
	
	//출력
	//첫 번째 줄에 YES, NO를 출력한다.
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
