package programmers;

import java.util.ArrayList;
import java.util.HashMap;

class A_Hash03_1st {
	static int answer = 0;
	static int[] ch;
	static ArrayList<String> categories = new ArrayList<>();
	static ArrayList<String> tmp = new ArrayList<>();
	
	public void DFS(int L) {
		if(L == categories.size()) {
			if(tmp.size() > 0) {
				System.out.println("---tmp.size : " + tmp.size());
				for(int i = 0; i < tmp.size(); i++) {
					System.out.print(tmp.get(i) + " ");
				}
				System.out.println();
				answer++;
			}
		} else {
			for(int i = 0; i < categories.size(); i++) {
				if(ch[i] == 0 && !tmp.contains(categories.get(i))) {
					ch[i] = 1;
					tmp.add(categories.get(L));
					DFS(L+1);
					ch[i] = 0;
					tmp.remove(categories.get(L));
				}
			}
		}
	}
	
	public int solution(String[][] clothes) {
		HashMap<String, Integer> map = new HashMap<>();
		for(int i = 0; i < clothes.length; i++) {
			map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);
		}
		if(map.size() == 1) return clothes.length;
		
		ch = new int[map.size()];
		System.out.println("map size : " + map.size());
		int i = 0;
		
		for(String x : map.keySet()) {
			categories.add(x);
			System.out.println(i + " : " + categories.get(i));
			i++;
		}
		DFS(0);
		return answer;
	}
	
	public static void main(String[] args) {
		A_Hash03_1st T = new A_Hash03_1st();
		String[][] clothes = {{"yellowhat", "headgear"},
				{"bluesunglasses", "eyewear"},
				{"green_turban", "headgear"}};
//		String[][] clothes = {{"crowmask", "face"},
//				{"bluesunglasses", "face"},
//				{"smoky_makeup", "face"}};
//		String[][] clothes = {{"bluehat", "headgear"},
//				{"bluesunglasses", "eyewear"},
//				{"smoky_makeup", "face"},
//				{"bluejeans", "bottom"},
//				{"pinkskirt", "bottom"},
//				{"beigecoat", "outer"}};
		System.out.println(T.solution(clothes));
	}
}
