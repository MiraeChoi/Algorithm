package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class A2981_1 {
	//시간 초과
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(br.readLine());
		Arrays.sort(arr);
		StringBuilder sb = new StringBuilder();
		out : for(int i = 2; i <= arr[N-1]; i++) {
			int rem = arr[0] % i;
//			System.out.println("rem : " + rem + " & " + i);
			for(int j = 1; j < N; j++) {
				if(arr[j] % i != rem) continue out;
			}
			sb.append(i).append(' ');
		}
		System.out.println(sb);
	}
}