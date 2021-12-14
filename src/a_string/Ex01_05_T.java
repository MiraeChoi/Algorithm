package a_string;

import java.util.Scanner;

class Ex01_05_T {
	public String solution(String str) {
		String answer = "";
		char[] s = str.toCharArray();
		int lt = 0, rt = str.length() - 1;
		
		while(lt < rt) {
			if(!Character.isAlphabetic(s[lt])) lt++;
			else if(!Character.isAlphabetic(s[rt])) rt--;
			else {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				
				lt++; rt--;
			}
		}
		
		answer = String.valueOf(s);
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex01_05_T T = new Ex01_05_T();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		
		System.out.println(T.solution(str));
	}
}
