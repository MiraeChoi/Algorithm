package a_string;

import java.util.Scanner;

class Ex01_06_Review {
	public String solution(String str) {
		String answer = "";
		
		for(int i = 0; i < str.length(); i++) {
			if(str.indexOf(str.charAt(i)) == i) answer += str.charAt(i);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex01_06_Review T = new Ex01_06_Review();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		
		System.out.print(T.solution(str));
	}
}
