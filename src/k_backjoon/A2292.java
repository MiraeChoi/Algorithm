package k_backjoon;

import java.util.Scanner;

class A2292 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cur = 1;
		int cnt = 0;
		
		if(n == 1) System.out.println(1);
		else {
			while(cur < n) cur += 6 * cnt++;
			System.out.println(cnt);
		}
	}
}
