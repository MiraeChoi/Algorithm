package a_string;

import java.util.ArrayList;
import java.util.Scanner;

class Ex01_08 {
	public String solution(String str) {
		String answer = "";
		char[] array = str.toUpperCase().toCharArray();
		ArrayList<Character> tmp = new ArrayList<>();
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] >= 'A' && array[i] <= 'Z') {
				tmp.add(array[i]);
			}
		}
		
		str = "";
		
		for(int i = 0; i < tmp.size(); i++) {
			str += tmp.get(i);
		}
		
		if(str.equals(new StringBuilder(str).reverse().toString())) answer = "YES";
		else answer = "NO";
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex01_08 T = new Ex01_08();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		
		System.out.print(T.solution(str));
	}
}
