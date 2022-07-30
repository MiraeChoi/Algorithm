package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A2231_2 {
	//맞았습니다!!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int n = Integer.parseInt(tmp);
		int in = n - 9 * tmp.length();
		if(in < 0) in = 0;
		int sum = n;
		for(int i = in; i < n; i++) {
			sum = i;
			System.out.println("i : " + i);
			String len = i + "";
			for(int j = 0; j < len.length(); j++) {
				sum += Integer.parseInt(len.substring(j, j + 1));
				System.out.println("sum : " + sum);
			}
			if(sum == n) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(0);
	}
}
