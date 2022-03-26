package programmers;

import java.util.Arrays;

class A_Hash01_2nd {
	public String solution(String[] participant, String[] completion) {
		String answer = "";
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		for(int i = 0; i < participant.length; i++) {
			if(i == participant.length-1) return participant[i];
			if(!participant[i].equals(completion[i])) {
				return participant[i];
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		A_Hash01_2nd T = new A_Hash01_2nd();
//		String[] par = {"leo", "kiki", "eden"};
//		String[] com = {"eden", "kiki"};
		String[] par = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] com = {"josipa", "filipa", "marina", "nikola"};
//		String[] par = {"mislav", "stanko", "mislav", "ana"};
//		String[] com = {"stanko", "ana", "mislav"};
		System.out.println(T.solution(par, com));
	}
}
