package e_stack_n_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//class Person {
//	int idx;
//	int priority;
//	
//	public Person(int idx, int priority) {
//		this.idx = idx;
//		this.priority = priority;
//	}
//}

class Ex05_08_M {
	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		
//		HashMap<Integer, Integer> person = new HashMap<>();
		Queue<Person> q = new LinkedList<>();
		
		for(int i = 0; i < n; i++) {
			q.offer(new Person(i, arr[i]));
			System.out.println(q.peek());
		}
		
		System.out.println(q);
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex05_08_M T = new Ex05_08_M();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		System.out.println(T.solution(n, m, arr));
	}
}
