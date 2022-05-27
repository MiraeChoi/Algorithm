package k_backjoon;

import java.util.Scanner;

public class A1065 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		
		if(n < 100) System.out.println(n);
		else {
			int answer = 99;
			
			for(int i = 100; i <= n; i++) {
				int fir = i / 100;
				int sec = i % 100 / 10;
				int thi = i % 10;
				
				if(fir - sec == sec - thi) answer++;
			}
			System.out.println(answer);
		}
	}
}
