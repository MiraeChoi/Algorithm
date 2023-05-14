package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

class A24479 {
	private static ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
	private static boolean[] visited;
	private static int cnt;
	
	private static void DFS(int V, int E, int R) {
		visited[R] = true;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		for(int i = 0; i <= N; i++) arr.add(new ArrayList<>());
		visited = new boolean[N + 1];
		for(int i = 0; i < arr.size(); i++) {
			st = new StringTokenizer(br.readLine());
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());
			arr.get(from).add(to);
			arr.get(to).add(from);
		}
		DFS(N, M, R);
		
	}
}