package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A10872_2 {
	static int DFS(int n) {
		if(n <= 1) return 1;
		else return DFS(n-1) * n;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println(DFS(n));
	}
}
