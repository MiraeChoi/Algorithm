package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class A1181 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		String[] arr = new String[n];
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < n; i++) {
			arr[i] = br.readLine();
			max = Math.max(max, arr[i].length());
		}
		
		String[] result = new String[n];
		int idx = 0;
		for(int i = 1; i <= max; i++) {
			int cnt = idx;
			for(int j = 0; j < n; j++) {
				if(arr[i].length() == i) {
					result[idx++] = arr[i];
				}
			}
			for(int j = cnt; j <= idx; j++) {
				//sort
			}
		}
		Arrays.sort(arr);
		
		for(int i = 0; i < n; i++) sb.append(arr[i]).append('\n');
		System.out.println(sb);
	}
}
