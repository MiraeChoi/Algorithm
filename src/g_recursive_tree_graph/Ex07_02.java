package g_recursive_tree_graph;

import java.util.Scanner;

class Ex07_02 {
	//설명
	//10진수 N이 입력되면 2진수로 변환하여 출력하는 프로그램을 작성하세요. 단 재귀함수를 이용해서 출력해야 합니다.
	
	//입력
	//첫 번째 줄에 10진수 N(1<=N<=1,000)이 주어집니다.
	
	//출력
	//첫 번째 줄에 이진수를 출력하세요.
	public void DFS(int n) {
		if(n == 0) return;
		else {
			DFS(n / 2);
			System.out.print(n % 2);
		}
	}
	
	public static void main(String[] args) {
		Ex07_02 T = new Ex07_02();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		T.DFS(n);
	}
}
