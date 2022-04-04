package d_hashmap_n_treeset;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Ex04_01 {
	//설명
	//학급 회장을 뽑는데 후보로 기호 A, B, C, D, E 후보가 등록을 했습니다.
	//투표용지에는 반 학생들이 자기가 선택한 후보의 기호(알파벳)가 쓰여져 있으며 선생님은 그 기호를 발표하고 있습니다.
	//선생님의 발표가 끝난 후 어떤 기호의 후보가 학급 회장이 되었는지 출력하는 프로그램을 작성하세요.
	//반드시 한 명의 학급회장이 선출되도록 투표결과가 나왔다고 가정합니다.
	
	//입력
	//첫 줄에는 반 학생수 N(5<=N<=50)이 주어집니다.
	//두 번째 줄에 N개의 투표용지에 쓰여져 있던 각 후보의 기호가 선생님이 발표한 순서대로 문자열로 입력됩니다.
	
	//출력
	//학급 회장으로 선택된 기호를 출력합니다.
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
