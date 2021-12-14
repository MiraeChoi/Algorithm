package d_hashmap_n_treeset;

import java.util.HashMap;
import java.util.Scanner;

class Ex04_02 {
	public String solution(String s1, String s2) {
		String answer = "NO";
		HashMap<Character, Integer> map = new HashMap<>();
		HashMap<Character, Integer> map2 = new HashMap<>();
		
		for(int i = 0; i < s1.length(); i++) map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0)+1);
		for(int i = 0; i < s2.length(); i++) map2.put(s2.charAt(i), map2.getOrDefault(s2.charAt(i), 0)+1);
		
		int count = 0;
		
		for(char key : map.keySet()) if(map.get(key) == map2.get(key)) count++;
		if(count == map.size()) answer = "YES";
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex04_02 T = new Ex04_02();
		Scanner kb = new Scanner(System.in);
		String s1 = kb.nextLine();
		String s2 = kb.nextLine();
		System.out.println(T.solution(s1, s2));
	}
}
