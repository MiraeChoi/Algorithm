package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A2447_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		char[][] syso = new char[num+1][num+1];
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= num; j++) syso[i][j] = '*';
		}
		int cur = num / 3;
		while(cur >= 3) {
			for(int i = cur + 1; i <= cur * 2; i++) {
				for(int j = cur + 1; j <= cur * 2; j++) {
					syso[i][j] = ' ';
				}
			}
			cur = cur / 3;
			System.out.println(cur);
		}
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= num; j++) System.out.print(syso[i][j]);
			System.out.println();
		}
	}
}
