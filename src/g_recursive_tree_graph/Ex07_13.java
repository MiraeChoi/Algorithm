package g_recursive_tree_graph;

import java.util.Scanner;
import java.util.Vector;

class Ex07_13 {
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
	static int n, m, answer = 0;
	static Vector<int[]> arr = new Vector<int[]>();
	static int[][] graph;
	
	public void BFS(int v) {
		int[] tmp = new int[n+1];
		tmp[0] = 0;
		arr.add(0, tmp);
		
		while(arr.size() < n+1) {
			tmp = new int[n+1];
			
			for(int i = 1; i <= n; i++) {
				if(graph[v][i] == 1) tmp[i] = i;
				else tmp[i] = 0;
			}
			arr.add(v, tmp);
			v++;
			
			for(int i = 1; i < arr.size(); i++) {
				System.out.print(i + ": ");
				for(int j = 1; j < arr.get(i).length; j++) {
					if(arr.get(i)[j] != 0) System.out.print(arr.get(i)[j] + " ");
				}
				System.out.println();
			}
			System.out.println("---------------------");
		}
//		answer = arr.size();
	}
	
	public static void main(String[] args) {
		Ex07_13 T = new Ex07_13();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		graph = new int[n+1][n+1];
		for(int i = 0; i < m; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			graph[a][b] = 1;
		}
		T.BFS(1);
		System.out.println(answer);
	}
}