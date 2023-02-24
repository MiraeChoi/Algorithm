package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A2444 {
	//맞았습니다!!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		int num = -1;
		for(int i = 1; i <= N; i++) {
			num += 2;
			int tmp = N;
			while(tmp-- > i) sb.append(' ');
			for(int j = 1; j <= num; j++) sb.append('*');
			sb.append('\n');
		}
		for(int i = N - 1; i >= 1; i--) {
			num -= 2;
			int tmp = N;
			while(tmp-- > i) sb.append(' ');
			for(int j = 1; j <= num; j++) sb.append('*');
			sb.append('\n');
		}
		System.out.println(sb);
	}
}