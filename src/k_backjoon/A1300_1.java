package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class A1300_1 {
	//메모리 초과
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int k = Integer.parseInt(br.readLine());
		double[][] A = new double[N+1][N+1];
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= N; j++) A[i][j] = i * j;
		}
		double[] B = new double[k+1];
		int idx = 1;
		out : for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= N; j++) {
				B[idx] = A[i][j];
				if(++idx > k) break out;
			}
		}
		Arrays.sort(B);
		System.out.println(B[k]);
	}
}