package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A1725 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] square = new int[N];
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < N; i++) {
			square[i] = Integer.parseInt(br.readLine());
			min = Math.min(min, square[i]);
		}
		int answer = min * N;
		int max = square[0], cnt = 1;
		for(int i = 1; i < N; i++) {
			if(square[i] > max) cnt++;
			else cnt = 1;
			max = Math.min(max, square[i]);
			int area = max * cnt;
			answer = Math.max(answer, area);
			System.out.println("answer : " + answer);
		}
		System.out.println(answer);
	}
}