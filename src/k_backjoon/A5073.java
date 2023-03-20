package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A5073 {
	//맞았습니다!!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			if(a == 0 && b == 0 && c == 0) break;
			if(a + b <= c || b + c <= a || a + c <= b) sb.append("Invalid").append("\n");
			else if(a == b && b == c) sb.append("Equilateral").append("\n");
			else if((a == b && b != c) || (b == c && c != a) || (a == c && c != b)) sb.append("Isosceles").append("\n");
			else sb.append("Scalene").append("\n");
		}
		System.out.println(sb);
	}
}