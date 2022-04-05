package g_recursive_tree_graph;

import java.util.Scanner;

class Ex07_01 {
	//설명
	//자연수 N이 입력되면 재귀함수를 이용하여 1부터 N까지를 출력하는 프로그램을 작성하세요.
	
	//입력
	//첫 번째 줄은 정수 N(3<=N<=10)이 입력된다.
	
	//출력
	//첫째 줄에 출력한다.
	public int[] solution(int n) {
		int[] answer = new int[n];
		
		for(int i = 0; i < n; i++) {
			answer[i] = i+1;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex07_01 T = new Ex07_01();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		for(int x : T.solution(n)) System.out.print(x + " ");
	}
}
