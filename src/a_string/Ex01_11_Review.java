package a_string;

import java.util.Scanner;

class Ex01_11_Review {
	public String solution(String s) {
		String answer = "";
		s = s + " ";
		int cnt = 0;
		
		for(int i = 0; i < s.length()-1; i++) {
			if(s.charAt(i) == s.charAt(i+1)) cnt++;
			else {
				answer += s.charAt(i);
				if(cnt > 1) answer += cnt;
				cnt = 1;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex01_11_Review T = new Ex01_11_Review();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		
		System.out.print(T.solution(str));
	}
}
