package d_hashmap_n_treeset;

import java.util.HashMap;
import java.util.Scanner;

class Ex04_04 {
	public int solution(String s, String t) {
		int answer = 0;
		HashMap<Character, Integer> map = new HashMap<>();
		int lt = 0;
		
		for(int i = 0; i < t.length(); i++) {
			map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0)+1);
		}
		
		for(int rt = 0; rt < s.length(); rt++) {
			if(map.containsKey(s.charAt(rt))) {
				map.put(s.charAt(rt), map.getOrDefault(s.charAt(rt), 0)-1);
			}
			
			if(rt == t.length() - 1 + lt) {
				int count = 0;
				
				for(int i = 0; i < t.length(); i++) {
					if(map.containsKey(t.charAt(i)) && map.get(t.charAt(i)) == 0) count++;
				}
				
				if(count == t.length()) answer++;
				
				map.put(s.charAt(lt), map.getOrDefault(s.charAt(lt), 0)+1);
				lt++;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex04_04 T = new Ex04_04();
		Scanner kb = new Scanner(System.in);
		String s = kb.next();
		String t = kb.next();
		System.out.println(T.solution(s, t));
	}
}
