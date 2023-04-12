package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class A4779 {
	//맞았습니다!!
	private static char[] ch;
	
	private static void DFS(int start, int length) {
		if(length < 3) return;
		for(int i = start + length / 3; i < start + length / 3 * 2; i++) {
			ch[i] = ' ';
		}
		DFS(start, length / 3);
		DFS(start + length / 3 * 2, length / 3);
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true) {
			String str = br.readLine();
			if(str == null || str.equals("")) break;
			int N = Integer.parseInt(str);
			ch = new char[(int)Math.pow(3, N)];
			Arrays.fill(ch, '-');
			DFS(0, (int)Math.pow(3, N));
			for(char x : ch) sb.append(x);
			sb.append('\n');
		}
		System.out.print(sb);
	}
}