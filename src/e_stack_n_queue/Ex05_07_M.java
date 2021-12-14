package e_stack_n_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Ex05_07_M {
	public String solution(String s1, String s2) {
		String answer = "YES";
		Queue<Character> q = new LinkedList<>();
		
		for(Character x : s1.toCharArray()) q.offer(x);
		
		for(int i = 0; i < s2.length(); i++) {
			if(q.contains(s2.charAt(i))) {
				if(q.peek() == s2.charAt(i)) q.poll();
				else return "NO";
			}
		}
		
		if(q.size() > 0) return "NO";
		return answer;
	}
	
	public static void main(String[] args) {
		Ex05_07_M T = new Ex05_07_M();
		Scanner kb = new Scanner(System.in);
		String s1 = kb.next();
		String s2 = kb.next();
		System.out.println(T.solution(s1, s2));
	}
}
