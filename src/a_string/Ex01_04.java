package a_string;

import java.util.Scanner;

class Ex01_04 {
	//설명
	//N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
	
	//입력
	//첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
	//두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.
	
	//출력
	//N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.
	public String solution(String str) {
		String answer = "";
		
		for(int i = str.length() - 1; i >= 0; i--) {
			answer += str.charAt(i);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex01_04 T = new Ex01_04();
		Scanner kb = new Scanner(System.in);
		int count = kb.nextInt();
		String[] array = new String[count];
		
		for(int i = 0; i < count; i++) {
			String str = kb.next();
			array[i] = str;
		}
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(T.solution(array[i]));
		}
	}
	
}
