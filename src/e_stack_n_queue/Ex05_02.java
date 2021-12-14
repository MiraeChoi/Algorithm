package e_stack_n_queue;

import java.util.Scanner;

class Ex05_02 {
	public String solution(String str) {
		String answer = "";
		int cnt = 0;
		
		for(char x : str.toCharArray()) {
			if(x == '(') cnt++;
			else if(x == ')') {
				cnt--;
				continue;
			}
			
			if(cnt == 0) answer += x + "";
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex05_02 T = new Ex05_02();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}
