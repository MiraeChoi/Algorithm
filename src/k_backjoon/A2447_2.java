package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A2447_2 {
	static StringBuilder sb = new StringBuilder();
	static int num;
	
	public static void makeStar() {
		int x = 1, y = 1;
		int xcnt = 1, ycnt = 1;
		int center = num / 2 + 1;
		for(int i = 1; i <= num; i++) {
			xcnt = 1;
			for(int j = 1; j <= num; j++) {
//				if()
				if(i % 3 == 2) {
					if(j % 3 != 2) sb.append('*');
					else sb.append(' ');
				}
				else if(j % 3 != 2) sb.append('*');
				else sb.append(' ');
				if(j % 3 == 0) xcnt++;
			}
			sb.append('\n');
			ycnt++;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		num = Integer.parseInt(br.readLine());
		makeStar();
		System.out.println(sb);
	}
}
