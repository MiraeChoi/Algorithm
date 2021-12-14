package a_string;

import java.util.ArrayList;
import java.util.Scanner;

class Ex01_06 {
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
