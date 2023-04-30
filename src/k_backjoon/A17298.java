package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A17298 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] arr = new int[N];
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
		for(int i = 0; i < N; i++) {
			for(int j = i + 1; j < N; j++) {
				if(arr[j] > arr[i]) {
					sb.append(arr[j]).append(' ');
					break;
				}
			}
		}
		System.out.print(sb);
	}
}