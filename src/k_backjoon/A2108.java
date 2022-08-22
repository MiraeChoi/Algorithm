package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class A2108 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int sum = 0, mid = 0, min = Integer.MAX_VALUE, range = 0;
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
			min = Math.min(min, arr[i]);
		}
		Arrays.sort(arr);
		System.out.println(sum / n);
		System.out.println(arr[n/2]);
		if(n == 1 || min != arr[1]) System.out.println(min);
		else {
			for(int i = 0; i< n; i++) {
				if(min != arr[i]) {
					System.out.println(arr[i]);
					break;
				}
			}
		}
		System.out.println(arr[n-1] - arr[0]);
	}
}
