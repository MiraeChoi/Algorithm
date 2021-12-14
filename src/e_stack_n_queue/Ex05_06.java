package e_stack_n_queue;

import java.util.Scanner;
import java.util.Stack;

class Ex05_06 {
	public int solution(int n, int k) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		for(int i = 1; i <= n; i++) stack.push(i);
		
		int cnt = 0;
		int p = 0;
		
		for(int i = 0; i < n-1; i++) {
			while(cnt != k) {
				cnt++;
				p++;
				if(p > n) p -= n;
				
				while(stack.get(p-1) == 0) {
					p++;
					if(p > n) p -= n;
				}
			}
			
			stack.set(p-1, 0);
			cnt = 0;
		}
		
		for(int i = 0; i < n; i++) {
			if(stack.get(i) != 0) answer = stack.get(i);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex05_06 T = new Ex05_06();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		System.out.println(T.solution(n, k));
	}
}
