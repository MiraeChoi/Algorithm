package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A1300_2 {
	//Æ²·È½À´Ï´Ù
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int k = Integer.parseInt(br.readLine());
		int idx = 1;
		while(k > 0) {
			for(int i = idx; i >= 1; ) {
				int cur = i;
				for(int j = 1; j <= cur; j++) {
					while(i > N || j > N) {
						i--; j++;
					}
					k--;
					if(k == 0) {
						System.out.println(i * j);
						return;
					}
					i--;
				}
			}
			idx++;
		}
	}
}