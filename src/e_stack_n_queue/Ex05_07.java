package e_stack_n_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Ex05_07 {
	public String solution(String s1, String s2) {
		String answer = "";
		Queue<Character> q1 = new LinkedList<>();
		Queue<Character> q2 = new LinkedList<>();
		
		for(int i = 0; i < s1.length(); i++) q1.offer(s1.charAt(i));
		for(int i = 0; i < s2.length(); i++) q2.offer(s2.charAt(i));
		
		while(q2.size() > 0) {
			if(q1.peek() == q2.peek()) {
				answer += q2.poll();
				q1.poll();
			} else {
				q2.poll();
			}
		}
		
		if(answer.equals(s1)) answer = "YES";
		else answer = "NO";
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex05_07 T = new Ex05_07();
		Scanner kb = new Scanner(System.in);
		String s1 = kb.next();
		String s2 = kb.next();
		System.out.println(T.solution(s1, s2));
	}
}
