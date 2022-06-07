package k_backjoon;

import java.util.Scanner;

public class A1152_2 {
	public static void main(String[] args) {
		int answer = 1;
		Scanner kb = new Scanner(System.in);
		String line = kb.nextLine();
		
		if(line.equals(" ")) System.out.println(0);
		else {
			line = line.trim();
			System.out.println(line);
			
			for(int i = 0; i < line.length(); i++) {
				if(line.charAt(i) == ' ') answer++;
			}
			System.out.println(answer);
		}
	}
}
