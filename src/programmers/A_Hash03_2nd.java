package programmers;

class A_Hash03_2nd {
	public int solution(String[][] clothes) {
		int answer = 0;
		
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
