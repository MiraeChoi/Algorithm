package d_hashmap_n_treeset;

import java.util.HashMap;
import java.util.Scanner;

class Ex04_02_T {
	public String solution(String s1, String s2) {
		String answer = "YES";
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char x : s1.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0)+1);
		}
		
		for(char x : s2.toCharArray()) {
			if(!map.containsKey(x) || map.get(x) == 0) return "NO";
			map.put(x, map.get(x)-1);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex04_02_T T = new Ex04_02_T();
		Scanner kb = new Scanner(System.in);
		String s1 = kb.nextLine();
		String s2 = kb.nextLine();
		System.out.println(T.solution(s1, s2));
	}
}
