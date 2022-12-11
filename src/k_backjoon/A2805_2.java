package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A2805_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine(), " ");
		int answer = 0;
		int MAX = Integer.MIN_VALUE;
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			MAX = Math.max(MAX, arr[i]);
		}
		for(int i = MAX; i >= 1; i--) {
			int cnt = 0;
			for(int j = 0; j < N; j++) {
				if(arr[j] - i > 0) cnt += arr[j] - i;
			}
			if(cnt >= M) {
				answer = i;
				break;
			}
		}
		System.out.println(answer);
	}
}
