package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A2231_1 {
	//맞았습니다!!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int sum = n;
		for(int i = 1; i < n; i++) {
			sum = i;
			System.out.println("i : " + i);
			String tmp = i + "";
			for(int j = 0; j < tmp.length(); j++) {
				sum += Integer.parseInt(tmp.substring(j, j + 1));
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
