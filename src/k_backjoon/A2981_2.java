package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A2981_2 {
	//시간 초과
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(br.readLine());
		int idx = 0;
		int min = arr[0], max = arr[N-1];
		StringBuilder sb = new StringBuilder();
		out : for(int i = 2; i <= max; i++) {
			int rem = min % i;
			if(i > min && rem != min) {
				idx++;
				if(idx == N-1) break;
				else min = arr[idx];
			}
			for(int j = 1; j < N; j++) {
				if(arr[j] % i != rem) continue out;
			}
			sb.append(i).append(' ');
		}
		System.out.println("6 % 10 = " + (6 % 10));
		System.out.println(sb);
	}
}