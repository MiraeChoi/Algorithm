package c_pointers_n_window;

import java.util.Scanner;

class Ex03_05_T2 {
	public int solution(int n) {
		int answer = 0, cnt = 1;
		n--;
		
		while(n > 0) {
			cnt++;
			n = n - cnt;
			
			if(n % cnt == 0) answer++;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex03_05_T2 T = new Ex03_05_T2();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.println(T.solution(n));
	}
}
