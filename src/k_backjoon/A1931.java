package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

class A1931 {
	//맞았습니다!!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int[][] tt = new int[N][2];
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			tt[i][0] = Integer.parseInt(st.nextToken());
			tt[i][1] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(tt, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1] == o2[1]) return o1[0] - o2[0];
				return o1[1] - o2[1];
			}
		});
		int answer = 0;
		int time = 0;
		for(int i = 0; i < N; i++) {
			if(time <= tt[i][0]) {
				time = tt[i][1];
				answer++;
			}
		}
		System.out.print(answer);
	}
}