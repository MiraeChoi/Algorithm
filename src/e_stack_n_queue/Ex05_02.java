package e_stack_n_queue;

import java.util.Scanner;

class Ex05_02 {
	//설명
	//입력된 문자열에서 소괄호 ( ) 사이에 존재하는 모든 문자를 제거하고 남은 문자만 출력하는 프로그램을 작성하세요.
	
	//입력
	//첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.
	
	//출력
	//남은 문자만 출력한다.
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
