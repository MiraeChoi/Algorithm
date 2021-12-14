package e_stack_n_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//class Person {
//	int id;
//	int priority;
//	
//	public Person(int id, int priority) {
//		this.id = id;
//		this.priority = priority;
//	}
//}

class Ex05_08_T {
	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		Queue<Person> Q = new LinkedList<>();
		
		for(int i = 0; i < n; i++) Q.offer(new Person(i, arr[i]));
		
		while(!Q.isEmpty()) {
			Person tmp = Q.poll();
			
			for(Person x : Q) {
				if(x.priority > tmp.priority) {
					Q.offer(tmp);
					tmp = null;
					break;
				}
			}
			
			for(Person x : Q) {
				System.out.print("tmp : " + x.id + " / " + x.priority + " | ");
			}
			System.out.println();
			
			if(tmp != null) {
				System.out.println(Q.size());
				System.out.println("------------------");
				answer++;
				if(tmp.id == m) return answer;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex05_08_T T = new Ex05_08_T();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		System.out.println(T.solution(n, m, arr));
	}
}
