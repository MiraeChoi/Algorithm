package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class A11478_1 {
	//맞았습니다!!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int n = str.length();
		int answer = 0;
		Queue<String> Q = new LinkedList<>();
		for(int i = 0; i < n; i++) {
			answer += n - i;
			for(int j = 0; j < n-i; j++) {
				String tmp = str.substring(j, j+i+1);
				if(Q.contains(tmp)) answer--;
				else Q.add(tmp);
			}
			Q.clear();
		}
		System.out.println(answer);
	}
}