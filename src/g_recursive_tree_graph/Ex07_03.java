package g_recursive_tree_graph;

import java.util.Scanner;

class Ex07_03 {
	//설명
	//자연수 N이 입력되면 N!를 구하는 프로그램을 작성하세요.
	//예를 들어 5!=5*4*3*2*1=120입니다.
	
	//입력
	//첫 번째 줄에 자연수 N(1<=N<=100)이 주어집니다.
	
	//출력
	//첫 번째 줄에 N팩토리얼 값을 출력합니다.
	int answer = 1;
	
	public int DFS(int n) {
		if(n == 0) return answer;
		else {
			answer = answer * n;
			DFS(n-1);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Ex07_03 T = new Ex07_03();
		Scanner kb = new Scanner(System.in);
		System.out.println(T.DFS(kb.nextInt()));
	}
}
