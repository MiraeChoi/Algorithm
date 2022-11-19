package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A3036_2 {
	static int func(int a, int b) {
		if(a % b == 0) return b;
		return func(b, a % b);
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		for(int i = 1; i < N; i++) {
			int b = Integer.parseInt(st.nextToken());
			int k = func(a, b);
			sb.append(a / k).append('/').append(b / k).append('\n');
		}
		System.out.println(sb);
	}
}