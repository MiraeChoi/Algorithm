package k_backjoon;

import java.util.Scanner;

public class A2525 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int h = kb.nextInt();
		int m = kb.nextInt();
		int time = kb.nextInt();
		m += time;
		
		if(m >= 60) {
			while(m >= 60) {
				h++;
				m = m - 60;
				time -= 60;
			}
		}
		if(h >= 24) h -= 24;
		System.out.printf("%d %d", h, m);
	}
}
