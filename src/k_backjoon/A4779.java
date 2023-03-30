package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A4779 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			int N = Integer.parseInt(br.readLine());
			for(int i = 1; i <= N * N * N; i++) {
				if(i > N) {
					for(int j = i; j <= N * N; j++) {
						
					}
				}
			}
		}
	}
}
