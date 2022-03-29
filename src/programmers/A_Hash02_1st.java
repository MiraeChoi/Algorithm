package programmers;

import java.util.Arrays;

class A_Hash02_1st {
	public boolean solution(String[] phone_book) {
		boolean answer = true;
		Arrays.sort(phone_book);
		String tmp, tmp2, tmp3 = "";
		
		for(int i = 1; i < phone_book.length-1; i++) {
			int idx = 0;
			int length = 0;
			
			if(phone_book[i+1].length() < phone_book[i-1].length()) {
				idx = i+1;
				length = phone_book[i+1].length();
			} else {
				idx = i-1;
				length = phone_book[i-1].length();
			}
			tmp = phone_book[i];
			int len = tmp.length();
			if(len > length) len = length;
			else idx = i;
			
			tmp = phone_book[i].substring(0, len);
			tmp2 = phone_book[i+1].substring(0, len);
			tmp3 = phone_book[i-1].substring(0, len);
			
			if(idx == i) {
				if(tmp.equals(tmp2) || tmp.equals(tmp3)) return false;
			} else if(idx == i+1) {
				if(tmp2.equals(tmp) || tmp2.equals(tmp3)) return false;
			} else if(idx == i-1) {
				if(tmp3.equals(tmp) || tmp3.equals(tmp2)) return false;
			}
		}
		return answer;
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
