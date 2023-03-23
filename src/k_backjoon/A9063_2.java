package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A9063_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int max_x = Integer.MIN_VALUE, min_x = Integer.MAX_VALUE;
		int max_y = Integer.MIN_VALUE, min_y = Integer.MAX_VALUE;
		while(N-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			if(x > max_x) max_x = x;
			if(x < min_x) min_x = x;
			if(y > max_y) max_y = y;
			if(y < min_y) min_y = y;
		}
		System.out.println((max_x - min_x) * (max_y - min_y));
	}
}