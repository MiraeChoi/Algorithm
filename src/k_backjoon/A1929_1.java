package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A1929_1 {
	//런타임 에러(NumberFormat)
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		out : for(int i = m; i <= n; i++) {
			if(i == 1) continue;
			if(i == 2) System.out.println(2);
			if(i % 2 == 0) continue;
			for(int j = 3; j * j < i; j += 2) {
				if(i % j == 0) continue out;
			}
			System.out.println(i);
		}
		br.close();
	}
}
