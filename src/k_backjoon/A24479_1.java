package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class A24479_1 {
	//맞았습니다!!
	private static ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
	private static int[] visited;
	private static int cnt = 1;
	
	private static void DFS(int R) {
		visited[R] = cnt;
		for(int i = 0; i < arr.get(R).size(); i++) {
			int cur = arr.get(R).get(i);
			if(visited[cur] == 0) {
				cnt++;
				DFS(cur);
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		for(int i = 0; i <= N; i++) arr.add(new ArrayList<>());
		visited = new int[N + 1];
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());
			arr.get(from).add(to);
			arr.get(to).add(from);
		}
		for(int i = 0; i < arr.size(); i++) Collections.sort(arr.get(i));
		DFS(R);
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= N; i++) sb.append(visited[i]).append('\n');
		System.out.print(sb);
	}
}