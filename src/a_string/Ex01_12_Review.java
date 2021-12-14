package a_string;

import java.util.Scanner;

class Ex01_12_Review {
	public String solution(int n, String s) {
		String answer = "";
		
		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(s.substring(0, 7).replace('#', '1').replace('*', '0'), 2);
			answer += (char)num;
			s = s.substring(7);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex01_12_Review T = new Ex01_12_Review();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String s = kb.next();
		
		System.out.println(T.solution(n, s));
	}
}
