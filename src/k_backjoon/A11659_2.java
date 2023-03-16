package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A11659_2 {
	//맞았습니다!!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine());
		int sum = 0;
		for(int i = 0; i < N; i++) {
			sum += Integer.parseInt(st.nextToken());
			arr[i] = sum;
		}
		StringBuilder sb = new StringBuilder();
		while(M-- > 0) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken()) - 2;
			int j = Integer.parseInt(st.nextToken()) - 1;
			if(i < 0) sb.append(arr[j]).append('\n');
			else sb.append(arr[j] - arr[i]).append('\n');
		}
		System.out.println(sb);
	}
}