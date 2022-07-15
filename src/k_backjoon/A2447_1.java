package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A2447_1 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static int num, num_3;
	static int x = 0, y = 1;
	
	public static void star() {
		x++;
		if(x % 3 == 2 && y % 3 == 2) sb.append(' ');
		else sb.append('*');
		if(x == num) {
			sb.append('\n');
			y++;
			x = 0;
		}
		if(y > num) return;
		else star();
	}
	
	public static void main(String[] args) throws IOException {
		num = Integer.parseInt(br.readLine());
		num_3 = num / 3;
		star();
		System.out.println(sb);
		br.close();
	}
}
