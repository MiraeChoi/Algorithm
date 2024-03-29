package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A10986_1 {
	//맞았습니다!!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[M];
		int sum = 0;
		for(int i = 0; i < N; i++) {
			sum = (sum + Integer.parseInt(st.nextToken())) % M;
			arr[sum]++;
		}
		long answer = arr[0];
		for(int i = 0; i < M; i++) answer += (long)arr[i] * (arr[i] - 1) / 2;
		System.out.println(answer);
	}
}