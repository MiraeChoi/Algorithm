package a_string;

import java.util.ArrayList;
import java.util.Scanner;

class Ex01_04_T {
	public ArrayList<String> solution(int n, String[] str) {
		ArrayList<String> answer = new ArrayList<>();
		
		for(String x : str) {
			//1
//			String tmp = new StringBuilder(x).reverse().toString();
//			answer.add(tmp);
			
			//2
			char[] s = x.toCharArray();
			int lt = 0;
			int rt = x.length() - 1;
			
			while(lt < rt) {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				
				lt++; rt--;
			}
			
			String tmp = String.valueOf(s);
			answer.add(tmp);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex01_04_T T = new Ex01_04_T();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String[] str = new String[n];
		
		for(int i = 0; i < n; i++) {
			str[i] = kb.next();
		}
		
		for(String x : T.solution(n, str)) {
			System.out.println(x);
		}
	}
}
