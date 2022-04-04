package d_hashmap_n_treeset;

import java.util.HashMap;
import java.util.Scanner;

class Ex04_04_M {
	//설명
	//S문자열에서 T문자열과 아나그램이 되는 S의 부분문자열의 개수를 구하는 프로그램을 작성하세요.
	//아나그램 판별시 대소문자가 구분됩니다. 부분문자열은 연속된 문자열이어야 합니다.
	
	//입력
	//첫 줄에 첫 번째 S문자열이 입력되고, 두 번째 줄에 T문자열이 입력됩니다.
	//S문자열의 길이는 10,000을 넘지 않으며, T문자열은 S문자열보다 길이가 작거나 같습니다.
	
	//출력
	//S단어에 T문자열과 아나그램이 되는 부분문자열의 개수를 출력합니다.
	public int solution(String s, String t) {
		int answer = 0;
		HashMap<Character, Integer> am = new HashMap<>();
		HashMap<Character, Integer> bm = new HashMap<>();
		
		for(int i = 0; i < t.length(); i++) bm.put(t.charAt(i), bm.getOrDefault(t.charAt(i), 0)+1);
		for(int i = 0; i < t.length()-1; i++) am.put(s.charAt(i), am.getOrDefault(s.charAt(i), 0)+1);
		
		int lt = 0;
		
		for(int rt = t.length()-1; rt < s.length(); rt++) {
			am.put(s.charAt(rt), am.getOrDefault(s.charAt(rt), 0)+1);
			
			if(am.equals(bm)) answer++;
			am.put(s.charAt(lt), am.get(s.charAt(lt))-1);
			
			if(am.get(s.charAt(lt)) == 0) am.remove(s.charAt(lt));
			lt++;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex04_04_M T = new Ex04_04_M();
		Scanner kb = new Scanner(System.in);
		String s = kb.next();
		String t = kb.next();
		System.out.println(T.solution(s, t));
	}
}
