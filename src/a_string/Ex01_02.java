package a_string;

import java.util.Scanner;

class Ex01_02 {
	//설명
	//대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
	
	//입력
	//첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.
	//문자열은 영어 알파벳으로만 구성되어 있습니다.
	
	//출력
	//첫 줄에 대문자는 소문자로, 소문자는 대문자로 변환된 문자열을 출력합니다.
	public String solution(String str) {
		String answer = "";
		
		for(char x : str.toCharArray()) {
//			if(x >= 'A' && x <= 'Z') {
//				x = (char)(x + 32);
//			} else if(x >= 'a' && x <= 'z') {
//				x = (char)(x - 32);
//			}
//			answer += x;
			if(Character.isLowerCase(x)) answer += Character.toUpperCase(x);
			else answer += Character.toLowerCase(x);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Ex01_02 T = new Ex01_02();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		
		System.out.print(T.solution(str));
	}
}
