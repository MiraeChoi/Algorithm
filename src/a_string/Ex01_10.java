package a_string;

import java.util.Scanner;

class Ex01_10 {
	//설명
	//한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
	
	//입력
	//첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
	//문자열의 길이는 100을 넘지 않는다.
	
	//출력
	//첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.
	public String solution(String str) {
		String answer = "";
		String s = str.split(" ")[0];
		char t = str.split(" ")[1].charAt(0);
		int[] sArr = new int[s.length()];
		
		int n = 1000;

		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == t) {
				n = 0;
				sArr[i] = n;
			} else sArr[i] = ++n;
		}
		
		n = 0;
		
		for(int i = s.length()-1; i >= 0; i--) {
			if(sArr[i] == 0) n = 0;
			else {
				++n;
				
				if(n < sArr[i]) {
					sArr[i] = n;
				}
			}
		}
		
		for(int i = 0; i < s.length(); i++) answer += sArr[i] + " ";
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex01_10 T = new Ex01_10();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		
		System.out.println(T.solution(str));
	}
}
