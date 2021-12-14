package a_string;

import java.util.Scanner;

class Ex01_09 {
	public int solution(String str) {
		int answer = 0;
		answer = Integer.parseInt(str.replaceAll("[^0-9]", ""));
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex01_09 T = new Ex01_09();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		
		System.out.print(T.solution(str));
	}
}
