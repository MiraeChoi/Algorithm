package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class A1966 {
	//틀렸습니다
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		while(T-- > 0) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken()); //문서의 개수
			int M = Integer.parseInt(st.nextToken()); //몇 번째로 인쇄되는지
			st = new StringTokenizer(br.readLine());
			int[] arr = new int[N];
			for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
			if(N == 1) sb.append(1).append('\n');
			else {
				Arrays.sort(arr);
				for(int i = 0; i < N; i++) {
					if(i == M) {
						if(i == N - 1) sb.append(i).append('\n');
						else if(arr[i+1] == arr[i]) {
							while(i < N - 1 && arr[i+1] == arr[i]) i++;
							sb.append(i + 1).append('\n');
						}
						else sb.append(i).append('\n');
						break;
					}
				}
			}
		}
		System.out.println(sb);
	}
}