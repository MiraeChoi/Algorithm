package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A25640 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String mbti = br.readLine();
		int n = Integer.parseInt(br.readLine());
		int answer = 0;
		for(int i = 0; i < n; i++) {
			if(mbti.equals(br.readLine())) answer++;
		}
		System.out.println(answer);
	}
}