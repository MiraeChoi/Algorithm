package g_recursive_tree_graph;

import java.util.Scanner;

class Ex07_12_M {
	//설명
	//방향그래프가 주어지면 1번 정점에서 N번 정점으로 가는 모든 경로의 가지 수를 출력한 프로그램을 작성하세요.
	//아래 그래프에서 1번 정점에서 5번 정점으로 가는 가지 수는
	//(그림 1)
	//1 2 3 4 5
	//1 2 5
	//1 3 4 2 5
	//1 3 4 5
	//1 4 2 5
	//1 4 5
	//총 6가지입니다.
	
	//입력
	//첫째 줄에는 정점의 수 N(1<=N<=20)과 간선의 수 M이 주어진다. 그 다음부터 M줄에 걸쳐 연결정보가 주어진다.
	
	//출력
	//총 가지수를 출력한다.
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
