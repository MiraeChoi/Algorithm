package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A2559 {
	//맞았습니다!!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[] arr = new int[N + 1];
		st = new StringTokenizer(br.readLine());
		int answer = Integer.MIN_VALUE;
		int sum = 0;
		for(int i = 1; i <= N; i++) {
			sum += Integer.parseInt(st.nextToken());
			arr[i] = sum;
			if(i >= K) {
				answer = Math.max(answer, sum - arr[i - K]);
			}
		}
		System.out.println(answer);
	}
}