package e_stack_n_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Ex05_07_Review {
	public String solution(String need, String plan) {
		String answer = "YES";
		Queue<Character> q = new LinkedList<>();
		
		for(char x : need.toCharArray()) q.offer(x);
		for(char x : plan.toCharArray()) {
			if(q.contains(x)) {
				if(x != q.poll()) return "NO";
			}
		}
		
		if(!q.isEmpty()) return "NO";
		return answer;
	}
	
	public static void main(String[] args) {
		Ex05_07_Review T = new Ex05_07_Review();
		Scanner kb = new Scanner(System.in);
		String s1 = kb.next();
		String s2 = kb.next();
		System.out.println(T.solution(s1, s2));
	}
}
