package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A9063_1 {
	//맞았습니다!!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int max_x = Integer.MIN_VALUE, min_x = Integer.MAX_VALUE;
		int max_y = Integer.MIN_VALUE, min_y = Integer.MAX_VALUE;
		while(N-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			max_x = Math.max(max_x, x); min_x = Math.min(min_x, x);
			max_y = Math.max(max_y, y); min_y = Math.min(min_y, y);
		}
		System.out.println((max_x - min_x) * (max_y - min_y));
	}
}