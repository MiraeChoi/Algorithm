package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class A24445 {
	//맞았습니다!!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		ArrayList<Integer>[] arr = new ArrayList[N + 1];
		for(int i = 1; i <= N; i++) arr[i] = new ArrayList<>();
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());
			arr[from].add(to);
			arr[to].add(from);
		}
		for(int i = 1; i <= N; i++) Collections.sort(arr[i], Collections.reverseOrder());
		int[] visited = new int[N + 1];
		Queue<Integer> Q = new LinkedList<>();
		Q.add(R);
		visited[R] = 1;
		int cnt = 1;
		while(!Q.isEmpty()) {
			int cur = Q.poll();
			for(int i = 0; i < arr[cur].size(); i++) {
				int num = arr[cur].get(i);
				if(visited[num] == 0) {
					cnt++;
					visited[num] = cnt;
					Q.add(num);
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= N; i++) sb.append(visited[i]).append('\n');
		System.out.print(sb);
	}
}