package a_string;

import java.util.Scanner;

class Ex01_07_Review {
	public String solution(String str) {
		String answer = "YES";
		//1. charAt
//		str = str.toLowerCase();
//		int len = str.length();
//		
//		for(int i = 0; i < len / 2; i++)
//			if(str.charAt(i) != str.charAt(len - i - 1)) return "NO";
		
		//2. StringBuilder
		String rev = new StringBuilder(str).reverse().toString();
		
		if(!str.equalsIgnoreCase(rev)) return "NO";
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex01_07_Review T = new Ex01_07_Review();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		
		System.out.print(T.solution(str));
	}
}
