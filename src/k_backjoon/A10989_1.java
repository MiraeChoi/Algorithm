package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class A10989_1 {
	//맞았습니다!!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(br.readLine());
		Arrays.sort(arr);
		for(int i = 0; i < n; i++) sb.append(arr[i] + "\n");
		System.out.println(sb);
		br.close();
	}
}
