package k_backjoon;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class A1157_2 {
	static String solution(String word) {
		if(word.length() == 1) return word.toUpperCase();
		
		word = word.toUpperCase();
		HashMap<String, Integer> map = new HashMap<>();
		int i = 0;
		do {
			String tmp = word.substring(i, i+1);
//			System.out.println(tmp);
			if(map.containsKey(tmp)) map.put(tmp, map.get(tmp) + 1);
			else map.put(tmp, 1);
			i++;
		} while(i < word.length());
		
//		System.out.println(map);
		int max = 0;
		String answer = "";
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for(Entry<String, Integer> entry : entrySet) {
			if(entry.getValue() > max) {
				max = entry.getValue();
				answer = entry.getKey();
			}
		}
		map.remove(answer);
		int max2 = Collections.max(map.values());
		
		if(max == max2) return "?";
		else return answer;
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String word = kb.nextLine();
		System.out.println(solution(word));
	}
}
