package e_stack_n_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person {
	int id;
	int priority;
	
	public Person(int id, int priority) {
		this.id = id;
		this.priority = priority;
	}
}

class Ex05_08_Review {
	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		Queue<Person> q = new LinkedList<>();
		
		for(int i = 0; i < n; i++) q.offer(new Person(i, arr[i]));
		
		while(!q.isEmpty()) {
			Person tmp = q.poll();
			
			for(Person x : q) {
				if(x.priority > tmp.priority) {
					q.offer(tmp);
					tmp = null;
					break;
				}
			}
			
			if(tmp != null) {
				answer++;
				if(tmp.id == m) return answer;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex05_08_Review T = new Ex05_08_Review();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		System.out.println(T.solution(n, m, arr));
	}
}
