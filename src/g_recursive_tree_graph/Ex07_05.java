package g_recursive_tree_graph;

import java.util.Scanner;

class Ex07_05 {
	//설명
	//아래 그림과 같은 이진트리의 전위순회와 후위순회를 연습해 보세요.
	//         1
	//     2       3
	//   4   5   6   7
	//전위순회 출력 : 1 2 4 5 3 6 7
	//중위순회 출력 : 4 2 5 1 6 3 7
	//후위순회 출력 : 4 5 2 6 7 3 1
	static int[] fibo;
	static int depth = 1;
	
	public int DFS(int n) {
		if(n == 1) return fibo[0] = 1;
		else {
			int cnt = 1;
			while(n != depth * 2 - 1) {
				depth = depth * 2;
				cnt++;
			}
			System.out.println("우하하 내 깊이 : " + cnt);
		}
		return n;
	}
	
	public static void main(String[] args) {
		Ex07_05 T = new Ex07_05();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		fibo = new int[n];
		T.DFS(n);
		for(int i = 0; i < fibo.length; i++) System.out.print(fibo[i] + " ");
	}
}
