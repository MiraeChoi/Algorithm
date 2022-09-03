package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A18870 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
		}
		int[] cnt = new int[max - min + 1];
		for(int i = 0; i < n; i++) {
			cnt[arr[i] - min]++;
			System.out.println("È®ÀÎ : " + (arr[i] - min));
		}
		
		int[] res = new int[n];
		for(int i = n-1; i >= 0; i--) {
			res[cnt[arr[i] - min]] = arr[i];
		}
		for(int i = 0; i < n; i++) System.out.print(res[i] + " ");
	}
}
