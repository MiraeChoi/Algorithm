package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A3036_1 {
	//맞았습니다!!
	public static int[] divisor(int a, int b) {
		int[] divisors = new int[2];
		divisors[0] = a; divisors[1] = b;
		if(a % b == 0) {
			divisors[0] = a / b;
			divisors[1] = 1;
		} else if(b % a == 0) {
			divisors[0] = 1;
			divisors[1] = b / a;
		} else {
			for(int i = Math.min(a, b)-1; i >= 2; i--) {
				if(a % i == 0 && b % i == 0) {
					divisors[0] = a / i;
					divisors[1] = b / i;
					break;
				}
			}
		}
		return divisors;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i < N; i++) {
			int[] answers = divisor(arr[0], arr[i]);
			sb.append(answers[0]).append('/').append(answers[1]).append('\n');
		}
		System.out.println(sb);
	}
}