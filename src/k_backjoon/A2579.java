package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A2579 {
	//맞았습니다!!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] dy = new int[N + 1];
		int[] step = new int[N + 1];
		for(int i = 1; i <= N; i++) step[i] = Integer.parseInt(br.readLine());
		dy[1] = step[1];
		if(N >= 2) dy[2] = step[1] + step[2];
		for(int i = 3; i <= N; i++) dy[i] = Math.max(dy[i - 2] , dy[i - 3] + step[i - 1]) + step[i];
		System.out.println(dy[N]);
	}
}