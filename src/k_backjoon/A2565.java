package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

class A2565 {
	//맞았습니다!!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] wire = new int[N][2];
		StringTokenizer st;
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			wire[i][0] = Integer.parseInt(st.nextToken());
			wire[i][1] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(wire, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0] - o2[0];
			}
		});
		int[] dy = new int[N];
		for(int i = 0; i < N; i++) {
			dy[i] = 1;
			for(int j = 0; j < i; j++) {
				if(wire[i][1] > wire[j][1]) dy[i] = Math.max(dy[i], dy[j] + 1);
			}
		}
		int answer = 0;
		for(int i = 0; i < N; i++) answer = Math.max(answer, dy[i]);
		System.out.println(N - answer);
	}
}