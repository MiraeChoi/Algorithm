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
		Arrays.sort(arr);
		for(int i = 1; i <= max; i++) {
			for(int j = 0; j < n; j++) {
				if(arr[j].length() == i) result[idx++] = arr[j];
			}
		}
		String tmp = result[0];
		sb.append(result[0]).append('\n');
		for(int i = 1; i < n; i++) {
			if(!tmp.equals(arr[i])) sb.append(result[i]).append('\n');
			else i++;
			tmp = result[i];
		}
		System.out.println(sb);
	}
}
