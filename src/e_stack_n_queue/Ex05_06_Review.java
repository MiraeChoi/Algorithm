package e_stack_n_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Ex05_06_Review {
	public int solution(int n, int k) {
		int answer = 0;
		Queue<Integer> q = new LinkedList<>();
		
		for(int i = 1; i <= n; i++) q.offer(i);
		
		while(!q.isEmpty()) {
			for(int i = 1; i < k; i++) q.offer(q.poll());
			q.poll();
			
			if(q.size() == 1) answer = q.poll();
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex05_06_Review T = new Ex05_06_Review();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		System.out.println(T.solution(n, k));
	}
}
