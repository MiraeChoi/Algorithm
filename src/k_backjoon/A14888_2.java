package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A14888_2 {
	//맞았습니다!!
	static int N;
	static long MAX = Long.MIN_VALUE, MIN = Long.MAX_VALUE;
	static int[] op = {0, 0, 0, 0}, arr;
	
	private static void DFS(long sum, int idx) {
		if(idx == N) {
			MAX = Math.max(sum, MAX);
			MIN = Math.min(sum, MIN);
			return;
		} else {
			for(int i = 0; i < 4; i++) {
				if(op[i] > 0) {
					op[i]--;
					switch(i) {
					case 0 : DFS(sum + arr[idx], idx + 1); break;
					case 1 : DFS(sum - arr[idx], idx + 1); break;
					case 2 : DFS(sum * arr[idx], idx + 1); break;
					case 3 : DFS(sum / arr[idx], idx + 1); break;
					}
					op[i]++;
				}
			}	
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < 4; i++) op[i] = Integer.parseInt(st.nextToken());
		DFS(arr[0], 1);
		System.out.println(MAX);
		System.out.println(MIN);
	}
}