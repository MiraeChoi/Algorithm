package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A10872_1 {
	static int answer = 1;
	
	static void DFS(int n) {
		if(n > 1) {
			answer *= n;
			DFS(n-1);
		}
		else return;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		DFS(n);
		System.out.println(answer);
	}
}
