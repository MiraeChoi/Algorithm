package a_string;

import java.util.Scanner;

class Ex01_03_Review {
	public String solution(String str) {
		String answer = "";
		String[] temp = str.split(" ");
		int n = Integer.MIN_VALUE;
		
		for(String x : temp) {
			if(temp.length > n) {
				answer = x;
				n = x.length();
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex01_03_Review T = new Ex01_03_Review();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		
		System.out.println(T.solution(str));
	}
}

