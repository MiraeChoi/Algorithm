package e_stack_n_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Ex05_08 {
	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		Queue<Integer> q = new LinkedList<>();
		int idx = m;
		int value = arr[m];
		System.out.println("m : " + m);

		for(int x : arr) q.offer(x);
		
		while(!q.isEmpty()) {
			if(q.size() == 1) break;
			int cnt = 0;
			
			for(int i = 0; i < q.size(); i++) {
				if(arr[i] > q.peek()) {
					q.offer(q.poll());
					cnt++;
					idx--;
					break;
				}
			}
			
			if(idx < 0) idx = q.size() + idx;
			
			if(cnt == 0) {
				answer++;
				System.out.println("q.peek() : " + q.peek());
				
				if(q.peek() == value && idx == 0) break;
				q.poll();
				System.out.println(q);
				idx--;
				if(idx < 0) idx = q.size() + idx;
			}
			
			System.out.println("idx : " + idx + " / q : " + q);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex05_08 T = new Ex05_08();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		System.out.println(T.solution(n, m, arr));
	}
}
