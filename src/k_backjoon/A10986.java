package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A10986 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		int answer = 0;
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
		for(int i = 0; i < N; i++) {
			//1 2
			//1 2 3
			//1 2 3 1 2
			//2 3 1
			//3
			//3 1 2
			//1 2
		}
		System.out.println(answer);
	}
}