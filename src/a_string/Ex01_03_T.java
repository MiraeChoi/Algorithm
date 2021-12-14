package a_string;

import java.util.Scanner;

public class Ex01_03_T {
	public String solution(String str) {
		//1¹ø
		String answer = "";
		int m = Integer.MIN_VALUE;
		String[] s = str.split(" ");
		
		for(String x : s) {
			int len = x.length();
			
			if(len > m) {
				m = len;
				answer = x;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex01_03_T T = new Ex01_03_T();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		
		System.out.print(T.solution(str));
	}
}
