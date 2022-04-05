package g_recursive_tree_graph;

import java.util.Scanner;

class Ex07_04 {
	//설명
	//1) 피보나치 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
	//2) 입력은 피보나치 수열의 총 항의 수이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.
	
	//입력
	//첫 줄에 총 항수 N(1<=N<=100)이 입력된다.
	
	//출력
	//첫 줄에 피보나치 수열을 출력합니다.
	int n0 = 0;
	int n1 = 1;
	
	public void DFS(int n) {
		if(n == 0) return;
		else {
			DFS(n-1);
			System.out.print(n1 + " ");
			int tmp = n1;
			n1 = n0 + n1;
			n0 = tmp;
		}
	}
	
	public static void main(String[] args) {
		Ex07_04 T = new Ex07_04();
		Scanner kb = new Scanner(System.in);
		T.DFS(kb.nextInt());
	}
}
