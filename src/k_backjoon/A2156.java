package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A2156 {
	//맞았습니다!!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] dy = new int[N + 1];
		int[] drink = new int[N + 1];
		for(int i = 1; i <= N; i++) drink[i] = Integer.parseInt(br.readLine());
		dy[1] = drink[1];
		if(N >= 2) dy[2] = drink[1] + drink[2];
		for(int i = 3; i <= N; i++) dy[i] = Math.max(Math.max(dy[i - 2], dy[i - 3] + drink[i - 1]) + drink[i], dy[i - 1]);
		System.out.println(dy[N]);
	}
}