package k_backjoon;

import java.util.Arrays;
import java.util.Scanner;

class A1316 {
	static int solution(int n, String[] word) {
		int answer = word.length;
		int[] spell = new int[26];
		char cur = 'A';
		
		for(int i = 0; i < word.length; i++) {
			Arrays.fill(spell, 0);
			for(int j = 0; j < word[i].length(); j++) {
				int tmp = word[i].charAt(j) - 97;
				System.out.println("tmp : " + tmp);
				
				if(spell[tmp] == 0) {
					spell[tmp] = 1;
					cur = word[i].charAt(j);
				} else {
					if(word[i].charAt(j) != cur) {
						answer--;
						break;
					}
				}
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] word = new String[n];
		for(int i = 0; i < n; i++) word[i] = sc.next();
		System.out.println(solution(n, word));
	}
}
