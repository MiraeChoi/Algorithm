package programmers;

import java.util.HashMap;

class A_Hash03_1st {
	public int solution(String[][] clothes) {
		int answer = 0;
		HashMap<String, Integer> map = new HashMap<>();
		for(int i = 0; i < clothes.length; i++) {
			map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);
		}
		System.out.println(map);
		
		if(map.size() == 1) return clothes.length;
		else {
			for(int i = 0; i < clothes.length; i++) {
				System.out.println(clothes[i][0] + " / " + clothes[i][1]);
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		A_Hash03_1st T = new A_Hash03_1st();
//		String[][] clothes = {{"yellowhat", "headgear"},
//				{"bluesunglasses", "eyewear"},
//				{"green_turban", "headgear"}};
//		String[][] clothes = {{"crowmask", "face"},
//				{"bluesunglasses", "face"},
//				{"smoky_makeup", "face"}};
		String[][] clothes = {{"bluehat", "headgear"},
				{"bluesunglasses", "eyewear"},
				{"smoky_makeup", "face"},
				{"bluejeans", "bottom"},
				{"pinkskirt", "bottom"},
				{"beigecoat", "outer"}};
		System.out.println(T.solution(clothes));
	}
}
