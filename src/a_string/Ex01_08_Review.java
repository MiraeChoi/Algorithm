package a_string;

import java.util.Scanner;

class Ex01_08_Review {
	public String solution(String str) {
		String answer = "NO";
		str = str.toUpperCase().replaceAll("[^A-Z]", "");
		String rev = new StringBuilder(str).reverse().toString();
		
		if(str.equals(rev)) return "YES";
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex01_08_Review T = new Ex01_08_Review();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		
		System.out.print(T.solution(str));
	}
}
