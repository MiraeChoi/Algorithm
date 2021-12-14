package d_hashmap_n_treeset;

import java.util.HashMap;
import java.util.Scanner;

class Ex04_01_T {
	public char solution(int n, String s) {
		char answer = 'A';
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char x : s.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0) + 1);
		}
		
		System.out.println(map.containsKey('A'));
		System.out.println(map.remove('A'));
		System.out.println(map.size());
		
		int max = Integer.MIN_VALUE;
		
		for(char key : map.keySet()) {
//			System.out.println(key + "/" + map.get(key));
			if(map.get(key) > max) {
				max = map.get(key);
				answer = key;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex04_01_T T = new Ex04_01_T();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String s = kb.next();
		System.out.println(T.solution(n, s));
	}
}
