package d_hashmap_n_treeset;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Ex04_01 {
	public String solution(int n, String str) {
		String answer = "";
		int ans = Integer.MIN_VALUE;
		Map<Integer, Integer> lord = new HashMap<>();
		int a = 0, b = 0, c = 0, d = 0, e = 0;
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'A') lord.put(0, a++);
			if(str.charAt(i) == 'B') lord.put(1, b++);
			if(str.charAt(i) == 'C') lord.put(2, c++);
			if(str.charAt(i) == 'D') lord.put(3, d++);
			if(str.charAt(i) == 'E') lord.put(4, e++);
		}
		
		for(int i = 0; i < lord.size(); i++) {
			if(lord.get(i) > ans) {
				ans = lord.get(i);
				
				if(i == 0) answer = "A";
				else if(i == 1) answer = "B";
				else if(i == 2) answer = "C";
				else if(i == 3) answer = "D";
				else if(i == 4) answer = "E";
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex04_01 T = new Ex04_01();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String str = kb.next();
		System.out.println(T.solution(n, str));
	}
}
