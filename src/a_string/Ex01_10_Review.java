package a_string;

import java.util.Scanner;

class Ex01_10_Review {
	public int[] solution(String s, char t) {
		int[] answer = new int[s.length()];
		int p = 1000;
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == t) {
				p = 0;
				answer[i] = p;
			} else {
				p++;
				answer[i] = p;
			}
		}
		
		p = 1000;
		
		for(int i = s.length()-1; i >= 0; i--) {
			if(s.charAt(i) == t) {
				p = 0;
			} else {
				p++;
				answer[i] = Math.min(p, answer[i]);
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex01_10_Review T = new Ex01_10_Review();
		Scanner kb = new Scanner(System.in);
		String s = kb.next();
		char t = kb.next().charAt(0);
		
		for(int x : T.solution(s, t)) System.out.print(x + " ");
	}
}
