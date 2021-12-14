package a_string;

import java.util.Scanner;

class Ex01_09_T {
	public int solution(String str) {
		String answer = "";
		//int answer = 0;
		
		for(char x : str.toCharArray()) {
			//1
			//if(x >= '0' && x <= '9') answer = answer * 10 + (x - 48);
			
			//2
			if(Character.isDigit(x)) answer += x;
		}
		
		return Integer.parseInt(answer);
	}
	
	public static void main(String[] args) {
		Ex01_09_T T = new Ex01_09_T();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		
		System.out.print(T.solution(str));
	}
}
