package a_string;

import java.util.Scanner;

class Ex01_11 {
	public String solution(String str) {
		String answer = "";
		int count = 1;
		
		for(int i = 0; i < str.length()-1; i++) {
			if(str.charAt(i) == str.charAt(i+1)) {
				count++;
			} else {
				answer += str.charAt(i) + "" + count;
				count = 1;
			}
			
			if(i == str.length()-2) {
				if(str.charAt(i) == str.charAt(i+1)) {
					answer += str.charAt(i+1) + "" + count;
				} else {
					answer += str.charAt(i+1);
				}
			}
		}
		
		answer = answer.replaceAll("1", "");
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex01_11 T = new Ex01_11();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		
		System.out.print(T.solution(str));
	}
}

