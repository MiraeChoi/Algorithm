package a_string;

import java.util.Scanner;

class Ex01_05_Review {
	public String solution(String str) {
		String answer = "";
		char[] array = str.toCharArray();
		int lt = 0, rt = array.length - 1;
		
		for(int i = 0; i < array.length; i++) {
			while(lt < rt) {
				if(!Character.isAlphabetic(array[lt])) lt++;
				else if(!Character.isAlphabetic(array[rt])) rt--;
				else {
					char tmp = array[lt];
					array[lt] = array[rt];
					array[rt] = tmp;
					
					lt++; rt--;
				}
			}
		}
		
		answer = String.valueOf(array);
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex01_05_Review T = new Ex01_05_Review();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		
		System.out.print(T.solution(str));
	}
}
