package a_string;

import java.util.Scanner;

class Ex01_06_T {
	public String solution(String str) {
		String answer = "";
		
		for(int i = 0; i < str.length(); i++) {
			if(i == str.indexOf(str.charAt(i))) answer += str.charAt(i);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex01_06_T T = new Ex01_06_T();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		
		System.out.print(T.solution(str));
	}
}
