package programmers;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class A_Hash01_1st {
	public String solution(String[] participant, String[] completion) {
		String answer = "";
		Arrays.sort(participant);
		Arrays.sort(completion);
		Queue<String> pQ = new LinkedList<>();
		Queue<String> cQ = new LinkedList<>();
		for(String x : participant) pQ.offer(x);
		for(String x : completion) cQ.offer(x);
		
		for(int i = 0; i < participant.length; i++) {
			String tmp = pQ.poll();
			int cnt = 0;
			
			for(int j = 0; j < completion.length; j++) {
				String tmpC = cQ.poll();
				
				if(tmp.equals(tmpC)) {
					cnt++; break;
				} else cQ.offer(tmpC);
			}
			if(cnt == 0) answer = tmp;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		A_Hash01_1st T = new A_Hash01_1st();
		String[] par = {"leo", "kiki", "eden"};
		String[] com = {"eden", "kiki"};
//		String[] par = {"marina", "josipa", "nikola", "vinko", "filipa"};
//		String[] com = {"josipa", "filipa", "marina", "nikola"};
//		String[] par = {"mislav", "stanko", "mislav", "ana"};
//		String[] com = {"stanko", "ana", "mislav"};
		System.out.println(T.solution(par, com));
	}
}
