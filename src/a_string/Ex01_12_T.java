package a_string;

import java.util.Scanner;

class Ex01_12_T {
	public String solution(int n, String s) {
		String answer = "";
		
		for(int i = 0; i < n; i++) {
			String tmp = s.substring(0, 7).replace('#', '1').replace('*', '0');
			int num = Integer.parseInt(tmp, 2);
			answer += (char)num;
			s = s.substring(7);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex01_12_T T = new Ex01_12_T();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String str = kb.next();
		System.out.println(T.solution(n, str));
	}
}
