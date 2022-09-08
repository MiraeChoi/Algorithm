package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A1436_2 {
	//Brute Force
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int sss = 666;
		int cnt = 1;
		while(cnt != n) {
			sss++;
			if(String.valueOf(sss).contains("666")) cnt++;
		}
		System.out.println(sss);
	}
}