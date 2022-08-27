package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A2108_1 {
	//맞았습니다!!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int[] cnt = new int[8001];
		int sum = 0, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, mode = 0, mode_max = 0;
		for(int i = 0; i < n; i++) {
			int value = Integer.parseInt(br.readLine());
			arr[i] = value;
			sum += value;
			cnt[value + 4000]++;
			max = Math.max(max, value);
			min = Math.min(min, value);
		}
		//mode
		boolean flag = false;
		for(int i = min + 4000; i <= max + 4000; i++) {
			if(cnt[i] > 0) {
				if(mode_max < cnt[i]) {
					mode_max = cnt[i];
					mode = i - 4000;
					flag = true;
				} else if(mode_max == cnt[i] && flag) {
					mode = i - 4000;
					flag = false;
				}
			}
		}
		//counting sort
		for(int i = min + 4001; i <= max + 4000; i++) cnt[i] += cnt[i-1];
		for(int i = min + 4000; i <= max + 4000; i++) System.out.println("cnt : " + cnt[i]);
		int[] result = new int[n];
		for(int i = n-1; i >= 0; i--) {
			if(cnt[arr[i] + 4000] > 0) result[--cnt[arr[i] + 4000]] = arr[i];
		}
		for(int i = 0; i < n; i++) System.out.println(i + " : " + result[i]);
		System.out.println((int)Math.round((float)sum / (float)n));
		System.out.println(result[n/2]);
		System.out.println(mode);
		System.out.println(max - min);
	}
}
