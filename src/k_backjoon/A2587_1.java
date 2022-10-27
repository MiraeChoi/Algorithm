package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class A2587_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[10];
		int sum = 0;
		for(int i = 0; i < 5; i++) {
			int num = Integer.parseInt(br.readLine());
			arr[num / 10]++;
			sum += num;
		}
		System.out.println(sum / 5);
		int cnt = 0;
		out : for(int i = 1; i < arr.length; i++) {
			if(arr[i] != 0) {
				while(arr[i] > 0) {
					cnt++;
					if(cnt == 3) {
						System.out.println(i * 10);
						break out;
					}
					arr[i]--;
				}
			}
		}
	}
}