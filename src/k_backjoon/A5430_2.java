package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A5430_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		wh : while(T-- > 0) {
			String fx = br.readLine();
			int n = Integer.parseInt(br.readLine());
			int[] dQ = new int[n];
			String str = br.readLine();
			int idx = 1;
			for(int i = 0; i < n; i++) {
				String num = "";
				for(int j = idx; j < str.length(); j++) {
					if(str.charAt(j) >= '1' && str.charAt(j) <= '9') {
						num += str.charAt(j) + "";
					} else {
						idx = j + 1;
						break;
					}
				}
				dQ[i] = Integer.parseInt(num);
			}
			int[] tmp = new int[n];
			for(int i = 0; i < fx.length(); i++) {
				if(fx.charAt(i) == 'R') {
					
				} else if(fx.charAt(i) == 'D') {
					
				}
			}
		}
		System.out.println(sb);
	}
}