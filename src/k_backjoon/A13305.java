package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A13305 {
	//100��
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long[] dist = new long[N - 1];
		long[] cost = new long[N];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N - 1; i++) dist[i] = Long.parseLong(st.nextToken());
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) cost[i] = Long.parseLong(st.nextToken());
		long answer = 0;
		long minCost = cost[0];
		for(int i = 0; i < N - 1; i++) {
			if(cost[i] < minCost) minCost = cost[i];
			answer += minCost * dist[i];
		}
		System.out.println(answer);
	}
}