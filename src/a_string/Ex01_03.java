package a_string;

import java.util.ArrayList;
import java.util.Scanner;

class Ex01_03 {
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
