package g_recursive_tree_graph;

import java.util.Scanner;

class Ex07_12_M {
	static int[][] arr;
	static int answer = 0;
	static int n;
	static int[] ch;
	
	public int DFS(int v) {
		ch[v] = 1;
		
		if(v == n) {
			answer++;
			ch[v] = 0;
		} else {
			for(int i = 1; i < arr.length; i++) {
				if(ch[i] == 0 && arr[v][i] == 1) {
					ch[i] = 1;
					DFS(i);
				}
			}
			ch[v] = 0;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Ex07_12_M T = new Ex07_12_M();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		int m = kb.nextInt();
		arr = new int[n+1][n+1];
		ch = new int[n+1];
		for(int i = 0; i < m; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			arr[a][b] = 1;
		}
		System.out.println(T.DFS(1));
	}
}
