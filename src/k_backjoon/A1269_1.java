package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A1269_1 {
	//맞았습니다!!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] cnt = new int[100000001];
		st = new StringTokenizer(br.readLine());
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		for(int i = 0; i < n; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			cnt[tmp]++;
			max = Math.max(max, tmp);
			min = Math.min(min, tmp);
		}
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < m; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			cnt[tmp]++;
			max = Math.max(max, tmp);
			min = Math.min(min, tmp);
		}
		int answer = 0;
		for(int i = min; i <= max; i++) {
			if(cnt[i] == 1) answer++;
		}
		System.out.println(answer);
	}
}