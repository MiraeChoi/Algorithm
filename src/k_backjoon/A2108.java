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
		int sum = 0, mid = 0, mode = 0, range = 0;
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}
		Arrays.sort(arr);
		System.out.println(Math.round((float)sum / (float)n));
		System.out.println(arr[n/2]);
		//최빈값을 출력한다. 여러 개 있을 때에는 최빈값 중 두 번째로 작은 값을 출력한다.
		mode = arr[0];
		int cnt = 0;
		for(int i = 0; i < n-1; i++) {
			if(arr[i] == arr[i+1]) {
				while(arr[i] == arr[i+1]) {
					cnt++;
					i++;
				}
			}
			if(cnt == 0) {
				System.out.println(mode);
				break;
			}
			cnt = 0;
		}
		System.out.println(arr[n-1] - arr[0]);
	}
}
