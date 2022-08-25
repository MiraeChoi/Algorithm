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
		int sum = 0, mid = 0, mode = 0, range = 0;
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}
		Arrays.sort(arr);
		System.out.println(Math.round((float)sum / (float)n));
		System.out.println(arr[n/2]);
		//최빈값 출력은 카운팅 정렬로
		int[] cnt = new int[n];
		for(int i = 0; i < n; i++) {
			cnt[i]++;
			for(int j = 0; j <= i; j++) {
				if(i != j) {
					if(arr[i] == arr[j]) cnt[i]++;
				}
			}
		}
		//최빈값 출력
		for(int i = 0; i < cnt.length; i++) {
			System.out.println(arr[i] + " : " + cnt[i]);
		}
		System.out.println(arr[n-1] - arr[0]);
	}
}
