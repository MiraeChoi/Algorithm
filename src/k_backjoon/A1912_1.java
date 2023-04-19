package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A1912_1 {
	//시간 초과
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
		int answer = -1001;
		int cnt = 0;
		for(int i = 0; i < n; i++) {
			int lt = 0, rt = 0 + i;
			while(rt < n) {
				cnt = 0;
				for(int j = lt; j <= rt; j++) {
					cnt += arr[j];
				}
				answer = Math.max(answer, cnt);
				lt++; rt++;
			}
		}
		System.out.println(answer);
	}
}