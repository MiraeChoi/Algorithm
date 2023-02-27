package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A10798 {
	//맞았습니다!!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[][] arr = new char[5][15];
		for(int i = 0; i < arr.length; i++) {
			String tmp = br.readLine();
			for(int j = 0; j < tmp.length(); j++) {
				arr[i][j] = tmp.charAt(j);
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 15; i++) {
			for(int j = 0; j < 5; j++) {
				if(arr[j][i] != 0) sb.append(arr[j][i]);
			}
		}
		System.out.println(sb);
	}
}