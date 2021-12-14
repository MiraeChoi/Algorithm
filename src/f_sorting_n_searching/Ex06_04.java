package f_sorting_n_searching;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Ex06_04 {
	public int[] solution(int s, int n, int[] arr) {
		int[] answer = new int[s];
		Queue<Integer> q = new LinkedList<>();
		
		for(int i = 0; i < n; i++) {
			if(!q.contains(arr[i])) {
				q.offer(arr[i]);
				
				for(int j = 0; j < q.size()-1; j++) q.offer(q.poll());
			} else {
				q.offer(arr[i]);
				
				for(int j = 0; j < q.size()-1;) {
					int tmp = q.poll();
					
					if(tmp != arr[i]) {
						q.offer(tmp);
						j++;
					}
				}
			}
			if(q.size() > s) {
				for(int j = 0; j < q.size()-1; j++) q.offer(q.poll());
				q.poll();
			}
			System.out.println("q : " + q);
		}
		
		for(int i = 0; i < s; i++) answer[i] = q.poll();
		return answer;
	}
	
	public static void main(String[] args) {
		Ex06_04 T = new Ex06_04();
		Scanner kb = new Scanner(System.in);
		int s = kb.nextInt();
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		for(int x : T.solution(s, n, arr)) System.out.print(x + " ");
	}
}
