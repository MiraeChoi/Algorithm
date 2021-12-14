package g_recursive_tree_graph;

import java.util.Scanner;

class Ex07_06 {
	public int plus(int n) {
		if(n >= 2) return n + plus(n-1);
		else return n;
	}
	
	public int[][] DFS(int n) {
		int length = n;
		for(int i = n-1; i >= 0; i--) length += plus(i);
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = i+1;
		
		int[][] answer = new int[length][n];
		System.out.println("length : " + length);
		int i = 0;
		int cnt = 1;
		
		while(cnt <= n) {
			int idx = i;
			length = plus(n-cnt+1);
			int lt = 0, rt = 1;
			
			if(cnt == 1) {
				//length 1짜리 배열 1, 2, 3  담기
				for(; i < n; i++) {
					answer[i][0] = i + 1;
				}
			} else {
				for(; i < length + idx; i++) {
					for(int j = 0; j < cnt; j++) {
						answer[i][j] = rt;
						rt++;
					}
					lt++;
				}
			}
			cnt++;
		}
		
		for(int i1 = 0; i1 < answer.length; i1++) {
			for(int j1 = 0; j1 < n; j1++) {
				if(answer[i1][j1] > 0) System.out.print(answer[i1][j1] + " ");
			}
			System.out.println();
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Ex07_06 T = new Ex07_06();
		Scanner kb = new Scanner(System.in);
//		int n = kb.nextInt();
		int n = 4;
		T.DFS(n);
	}
}
