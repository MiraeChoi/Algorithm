package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class A11478 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int n = str.length();
		int answer = 0;
		for(int i = 1; i <= n; i++) answer += i;
		for(int i = 1; i <= n; i++) {
			Queue<Character> Q = new LinkedList<>();
			for(int j = 1; j <= i; j++) {
				if(Q.contains(str.substring(j, j+i))) answer--;
//				else Q.add(str.substring(j, j+i)));
			}
		}
	}
}
