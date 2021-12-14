package a_string;

import java.util.Scanner;

class Ex01_01_Review {
	public int solution(String str, char t) {
		int answer = 0;
		str = str.toUpperCase();
		t = Character.toUpperCase(t);
		
		for(char x : str.toCharArray()) {
			if(x == t) answer++;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex01_01_Review T = new Ex01_01_Review();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		char c = kb.next().charAt(0);
		
		System.out.print(T.solution(str, c));
	}
}

