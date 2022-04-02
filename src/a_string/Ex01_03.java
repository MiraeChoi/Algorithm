package a_string;

import java.util.ArrayList;
import java.util.Scanner;

class Ex01_03 {
	//설명
	//한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
	//문장 속의 각 단어는 공백으로 구분됩니다.
	
	//입력
	//첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어집니다. 문장은 영어 알파벳으로만 구성되어 있습니다.
	
	//출력
	//첫 줄에 가장 긴 단어를 출력한다. 가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한 단어를 답으로 합니다.
	public String solution(String str) {
		String answer = "";
		ArrayList<String> array = new ArrayList<String>();
		
		int num = 0;
		
		for(int i = 0; i < str.length(); i++) {
			answer += str.charAt(num);
			num++;
			
			if(str.charAt(num) == ' ') {
				array.add(answer);
				answer = "";
				num++;
				continue;
				
			} else if(num >= str.length() -1) {
				answer += str.charAt(num);
				array.add(answer);
				answer = "";
				num = 0;
				break;
			}
		}
		
		String[] temp = new String[array.size()];
		answer = "";

		for(int i = 0; i < array.size(); i++) {
			temp[i] = array.get(i);
		}
		
		for(int i = 0; i < temp.length; i++) {
			for(int j = 0; j < i; j++) {
				if(temp[i].length() > temp[j].length()) {
					if(temp[i].length() > answer.length()) {
						answer = temp[i];
					}
				} else {
					answer = temp[j];
				}
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex01_03 T = new Ex01_03();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		
		System.out.print(T.solution(str));
	}
}
