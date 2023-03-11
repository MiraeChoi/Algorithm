package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A1735_1 {
	//맞았습니다!!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A1 = Integer.parseInt(st.nextToken());
		int B1 = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int A2 = Integer.parseInt(st.nextToken());
		int B2 = Integer.parseInt(st.nextToken());
		int answer = 0;
		int max = Math.max(B1, B2);
		for(int i = 1; ; i++) {
			answer = max * i;
			if(answer % B1 == 0 && answer % B2 == 0) break;
		}
		A1 = A1 * (answer / B1);
		A2 = A2 * (answer / B2);
		int A = A1 + A2;
		int B = answer;
		int min = Math.min(A, B);
		for(int i = min; i >= 2; i--) {
			if(A % i == 0 && B % i == 0) {
				A = A / i;
				B = B / i;
			}
		}
		System.out.println(A + " " + B);
	}
}