package k_backjoon;

import java.util.Arrays;
import java.util.Scanner;

class A1157_1 {
	static String solution(String word) {
		if(word.length() == 1) return word.toUpperCase();
		
		String[] arr = new String[word.length()];
		for(int i = 0; i < word.length(); i++) arr[i] = word.substring(i, i+1);
		for(int i = 0; i < word.length(); i++) System.out.print(arr[i] + " ");
		System.out.println();
		Arrays.sort(arr);
		int max = 0;
		int cnt = 0;
		String answer = "";
		
		for(int i = 1; i < word.length(); i++) {
			if(arr[i-1] == arr[i]) cnt++;
			else {
				if(max != 0 && max == cnt) return "?";
				max = Math.max(cnt, max);
				answer = arr[i-1];
				cnt = 0;
			}
		}
		return answer.toUpperCase();
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String word = kb.nextLine();
		System.out.println(solution(word));
	}
}
