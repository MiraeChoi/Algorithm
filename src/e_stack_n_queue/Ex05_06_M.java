package e_stack_n_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Ex05_06_M {
	public int solution(int n, int k) {
		int answer = 0;
		Queue<Integer> q = new LinkedList<>();
		
		for(int i = 1; i <= n; i++) q.offer(i);
		
		int cnt = 1;
		
		for(int i = 0; i < n; i++) {
			while(cnt < k) {
				cnt++;
				q.offer(q.poll());
			}
			
			q.poll();
			cnt = 1;

			if(q.size() == 1) answer = q.poll();
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex05_06_M T = new Ex05_06_M();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		System.out.println(T.solution(n, k));
	}
}
