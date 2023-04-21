package k_backjoon;

import java.io.IOException;

class A10986_2 {
	public static void main(String args[]) throws Exception {
		int N = readInt();
		int M = readInt();
		int sum = 0;
		int[] arr = new int[M];
		arr[0] = 1;
		for(int i = 1; i <= N; i++) {
			sum = (sum + readInt()) % M;
			arr[sum]++;
		}
		long answer = 0;
		for(int i = 0; i < M; i++) answer += arr[i] * (arr[i] - 1) / 2;
		System.out.println(answer);
	}

	private static int readInt() throws IOException {
		int n = 0;
		boolean isNegative = false;
		while(true) {
			int input = System.in.read();
			if(input <= 32) return isNegative ? n * -1 : n;
			else if(input == '-') isNegative = true;
			else n = (n << 3) + (n << 1) + (input & 15);
		}
	}
}