package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A12015 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int answer = -1;
		int idx = 0, i = 0;
		while(i < N) {
			for(i = 0; i < N; i++) {
				int cnt = 0;
				int cur = arr[i];
				for(int j = i + idx; j < N; j++) {
					if(cur > arr[j]) cnt++;
				}
				idx++;
				answer = Math.max(answer, cnt);
			}
			if(idx >= N) {
				i++;
				idx = i;
			}
		}
		System.out.println(answer);
	}
}
