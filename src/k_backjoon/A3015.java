package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A3015 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] person = new int[N];
		for(int i = 0; i < N; i++) person[i] = Integer.parseInt(br.readLine());
		int answer = 0;
		// 2 4 / 2 5 / 4 1 / 4 2 / 4 5
		// 1 2 / 1 5 / 2 2 / 2 5 / 5 1
		for(int i = 0; i < N - 1; i++) {
			int cur = person[i + 1];
			answer++;
			for(int j = i + 2; j < N; j++) {
				if(person[j] > cur) {
					System.out.println("answer : " + cur + " " + person[j]);
					cur = person[j];
					answer++;
				}
			}
			System.out.println(i + " : " + answer);
		}
		System.out.print(answer);
	}
}