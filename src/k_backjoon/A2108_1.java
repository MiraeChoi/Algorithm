package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class A2108_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int sum = 0, max = Integer.MIN_VALUE, min = 0, mode = 0, mode_max = 0;
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
		}
		//mode : counting sort
		int[] cnt = new int[8001];
		for(int i = 0; i < n; i++) cnt[arr[i] + 4000]++;
		for(int i = min + 4001; i <= max + 4000; i++) cnt[i] = cnt[i-1] + cnt[i];
		int[] result = new int[n];
		for(int i = n-1; i >= 0; i--) result[cnt[arr[i] + 4000] - 1] = arr[i];
		for(int i = 0; i < n; i++) {
			System.out.println(i + " result : " + result[i]);
		}
		boolean flag = false;	 
		for(int i = 0; i < n; i++) {
			if(result[i] > 0) {
				if(mode_max < result[i]) {
					mode_max = result[i];
					mode = i - 4000;
					flag = true;
				} else if(mode_max == result[i] && flag) {
					mode = i - 4000;
					flag = false;
				}
			}
		}
		System.out.println((int)Math.round((float)sum / (float)n));
		System.out.println(result[n/2]);
		System.out.println(mode + 4000);
		System.out.println(max - min);
	}
}
