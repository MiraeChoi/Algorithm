package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A2720 {
	//맞았습니다!!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int[] money = {25, 10, 5, 1};
		StringBuilder sb = new StringBuilder();
		while(T-- > 0) {
			int[] answer = new int[4];
			int C = Integer.parseInt(br.readLine());
			for(int i = 0; i < money.length; i++) {
				while(money[i] <= C) {
					C -= money[i];
					answer[i]++;
				}
			}
			for(int i = 0; i < answer.length; i++) sb.append(answer[i]).append(' ');
			sb.append('\n');
		}
		System.out.println(sb);
	}
}