package g_recursive_tree_graph;

import java.util.Scanner;
import java.util.Stack;

class Ex07_12 {
	int answer = 1;
	int cur = 1;
	
	public int DFS(int n, int[][] arr) {
		Stack<Integer> stack = new Stack<>();
		int cnt = 0;
		
		for(int i = 1; i < arr.length; i++) {
			for(int j = 1; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		for(int i = 1; i < arr.length; i++) {
			for(int j = 1; j < arr[i].length; j++) {
				if(arr[i][j] != 0 && !stack.contains(j)) {
					stack.add(j);
					cnt++;
				}
			}
			if(cnt != 0) answer *= cnt;
			stack.clear();
			System.out.println("answer : " + answer);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex07_12 T = new Ex07_12();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[][] arr = new int[n+1][n+1];
		
		for(int i = 0; i < m; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			arr[a][b] = 1;
		}
		System.out.println(T.DFS(n, arr));
	}
}
