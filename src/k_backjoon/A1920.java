package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A1920 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(arr);
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < m; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			boolean add = false;
			for(int j = 0; j < n; j++) {
				if(tmp > arr[j]) break;
				else if(tmp < arr[j]) continue;
				else {
					sb.append(1).append('\n');
					add = true;
					break;
				}
			}
			if(!add) sb.append(0).append('\n');
		}
		System.out.println(sb);
	}
}