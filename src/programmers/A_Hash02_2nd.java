package programmers;

import java.util.Arrays;

class A_Hash02_2nd {
	public boolean solution(String[] phone_book) {
		Arrays.sort(phone_book);
		
		for(int i = 0; i < phone_book.length-1; i++) {
			for(int j = i+1; j < phone_book.length; j++) {
				if(phone_book[i].startsWith(phone_book[j])) return false;
				if(phone_book[j].startsWith(phone_book[i])) return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		A_Hash02_1st T = new A_Hash02_1st();
//		String[] phone_book = {"119", "97674223", "1195524421"};
//		String[] phone_book = {"123","456","789"};
//		String[] phone_book = {"12","123","1235","567","88"};
		String[] phone_book = {"111113", "1112", "12"};
		System.out.println(T.solution(phone_book));
	}
}
