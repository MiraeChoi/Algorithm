package c_pointers_n_window;

import java.util.Scanner;

class Ex03_05 {
	public int solution(int n) {
		int answer = 0;
		int sum = 0;
		int cnt = n / 2 + 1;
		
		for(int lt = 1; lt <= cnt; lt++) {
			sum += lt;
			for(int rt = lt+1; rt <= cnt; rt++) {
				sum += rt;
				
				if(sum == n) {
					answer++;
					System.out.println("lt´Â " + lt + ", rt´Â " + rt + ", sumÀº " + sum);
					break;
				}
				if(sum > n) break;
			}
			sum = 0;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex03_05 T = new Ex03_05();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.println(T.solution(n));
	}
}
