package a_string;

import java.util.Scanner;

class Ex01_07_T {
	public String solution(String str) {
		String answer = "YES";
		//1
//		str = str.toUpperCase();
//		
//		for(int i = 0; i < str.length() / 2; i++)
//			if(str.charAt(i) != str.charAt(str.length() - i - 1)) return "NO";
		
		//2
		String tmp = new StringBuilder(str).reverse().toString();
		
		if(!str.equalsIgnoreCase(tmp)) return "NO";
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex01_07_T T = new Ex01_07_T();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		
		System.out.print(T.solution(str));
	}
}
