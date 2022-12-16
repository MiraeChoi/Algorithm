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
		double idx = 1;
		while(k > 0) {
			out : for(double i = idx; i >= 1; ) {
				double cur = i;
				for(double j = 1; j <= cur; j++) {
					while(i > N) {
						i--; j++;
					}
					while(j > N) break out;
					k--;
					if(k == 0) {
						System.out.printf("%.0f", i * j);
						return;
					}
					i--;
				}
			}
			idx++;
		}
	}
}