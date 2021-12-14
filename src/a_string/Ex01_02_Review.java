package a_string;

import java.util.Scanner;

class Ex01_02_Review {
	public String solution(String str) {
		String answer = "";
		
		for(char x : str.toCharArray()) {
			if(Character.isUpperCase(x)) answer += Character.toLowerCase(x);
			else answer += Character.toUpperCase(x);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex01_02_Review T = new Ex01_02_Review();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		
		System.out.print(T.solution(str));
	}
}
