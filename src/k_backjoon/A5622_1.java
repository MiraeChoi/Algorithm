package k_backjoon;

import java.util.Scanner;

class A5622_1 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		int answer = 0;
		
		for(int i = 0; i < str.length(); i++) {
			char tmp = str.charAt(i);
			if(tmp >= 'A' && tmp <= 'C') answer += 3;
			if(tmp >= 'D' && tmp <= 'F') answer += 4;
			if(tmp >= 'G' && tmp <= 'I') answer += 5;
			if(tmp >= 'J' && tmp <= 'L') answer += 6;
			if(tmp >= 'M' && tmp <= 'O') answer += 7;
			if(tmp >= 'P' && tmp <= 'S') answer += 8;
			if(tmp >= 'T' && tmp <= 'V') answer += 9;
			if(tmp >= 'W' && tmp <= 'Z') answer += 10;			
		}
		System.out.println(answer);
	}
}
