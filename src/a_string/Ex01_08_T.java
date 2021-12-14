package a_string;

import java.util.Scanner;

class Ex01_08_T {
	public String solution(String str) {
		String answer = "NO";
		str = str.toUpperCase().replaceAll("[^A-Z]", "");
		String tmp = new StringBuilder(str).reverse().toString();
		
		if(str.equals(tmp)) return "YES";
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex01_08_T T = new Ex01_08_T();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		
		System.out.print(T.solution(str));
	}
}

