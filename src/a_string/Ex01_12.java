package a_string;

import java.util.Scanner;

class Ex01_12 {
	public String solution(int n, String str) {
		String answer = "";
		String[] arr = new String[str.length() / 7];
		String tmp = "";
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '#') tmp += 1;
			else tmp += 0;
		}
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = tmp.substring(7 * i, 7 * (i+1));
			int num = Integer.parseInt(arr[i], 2);
			answer += (char)num;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex01_12 T = new Ex01_12();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String str = kb.next();
		
		System.out.print(T.solution(n, str));
	}
}
