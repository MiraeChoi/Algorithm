package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class A24479_2 {
	private static ArrayList<Integer>[] arr;
	private static int[] visited;
	private static int cnt = 1;
	
	private static void DFS(int R) {
		if(visited[R] > 0) return;
		visited[R] = cnt++;
		for(int x : arr[R]) DFS(x);
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		arr = new ArrayList[N + 1];
		for(int i = 0; i <= N; i++) arr[i] = new ArrayList<>();
		visited = new int[N + 1];
		while(M-- > 0) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			arr[i].add(j);
			arr[j].add(i);
		}
		for(int i = 0; i <= N; i++) Collections.sort(arr[i]);
		DFS(R);
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= N; i++) sb.append(visited[i]).append('\n');
		System.out.print(sb);
	}
}