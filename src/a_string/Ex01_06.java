package a_string;

import java.util.ArrayList;
import java.util.Scanner;

class Ex01_06 {
	//설명
	//소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
	//중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
	
	//입력
	//첫 줄에 문자열이 입력됩니다. 문자열의 길이는 100을 넘지 않는다.
	
	//출력
	//첫 줄에 중복문자가 제거된 문자열을 출력합니다.
	public String solution(String str) {
		String answer = "";
		char[] array = str.toCharArray();
		ArrayList<Character> temp = new ArrayList<Character>();
		
		for(int i = 0; i < array.length; i++) {
			int count = 0;
			
			for(int j = 0; j < temp.size(); j++) {
				if(array[i] == temp.get(j)) {
					count++;
				}
			}
			
			if(count == 0) {
				temp.add(array[i]);
			}
		}
		
		for(int i = 0; i < temp.size(); i++) {
			answer += temp.get(i);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex01_06 T = new Ex01_06();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		
		System.out.println(T.solution(str));
	}
}
