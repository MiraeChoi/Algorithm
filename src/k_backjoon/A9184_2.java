package k_backjoon;

import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;

class A9184_2 {
	private static int[] arr;
	
	private static int w(int a, int b, int c) {
		if(a <= 0 || b <= 0 || c <= 0) return 1;
		
		//동적계획법
		return 0;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			if(a == -1 && b == -1 && c == -1) break;
			int max = Math.max(a, Math.max(b, c));
			arr = new int[max + 1];
			w(a, b, c);
			sb.append("w(").append(a).append(", ").append(b).append(", ").append(c).append(") = ")
				.append("내용 입력").append("\n");
		}
		System.out.println(sb);
	}
}