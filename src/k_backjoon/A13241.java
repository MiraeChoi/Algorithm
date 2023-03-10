package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A13241 {
	//맞았습니다!!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		long max = Math.max(A, B);
		for(int i = 1; i <= A * B; i++) {
			long answer = max * i;
			if(answer % A == 0 && answer % B == 0) {
				System.out.println(answer);
				break;
			}
		}
	}
}