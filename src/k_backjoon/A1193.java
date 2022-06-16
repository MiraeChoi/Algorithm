package k_backjoon;

import java.util.Scanner;

class A1193 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n == 1) System.out.println("1/1");
		else {
			int cnt = 1;
			int l = 1;
			int r = 1;
			
			while(cnt < n) {
				if(l == 1) {
					r++;
					cnt++;
					while(r > 1 && cnt < n) {
						l++; r--;
						cnt++;
					}
				} else if(r == 1) {
					l++;
					cnt++;
					while(l > 1 && cnt < n) {
						l--; r++;
						cnt++;
					}
				}
			}
			System.out.println(l + "/" + r);
		}
	}
}
