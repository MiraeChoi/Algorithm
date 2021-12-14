package a_string;

import java.util.Scanner;

class Ex01_02 {
	public String solution(String str) {
		String answer = "";
		
		for(char x : str.toCharArray()) {
//			if(x >= 'A' && x <= 'Z') {
//				x = (char)(x + 32);
//			} else if(x >= 'a' && x <= 'z') {
//				x = (char)(x - 32);
//			}
//			answer += x;
			if(Character.isLowerCase(x)) answer += Character.toUpperCase(x);
			else answer += Character.toLowerCase(x);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Ex01_02 T = new Ex01_02();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		
		System.out.print(T.solution(str));
	}
}
