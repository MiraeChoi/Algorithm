package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A14889 {
	static int N, answer = Integer.MAX_VALUE;
	static int[][] arr;
	static boolean[] team;
	
	private static void DFS(int L) {
		if(L == N / 2) {
			
		} else {
			for(int i = 0; i < N; i++) {
				if(!team[i]) team[i] = true;
				DFS(L + 1);
				team[i] = false;
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[N][N];
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		team = new boolean[N];
		DFS(0);
		System.out.println(answer);
	}
}
