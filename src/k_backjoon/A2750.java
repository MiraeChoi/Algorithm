package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class A2750 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(br.readLine());
		//»ðÀÔ Á¤·Ä
		for(int i = 1; i < n; i++) {
			for(int j = i - 1; j < n - 1; j++) {
				if(arr[i] > arr[j]) {
					int tmp = arr[j];
					arr[j] = arr[i];
					arr[i] = tmp;
				}
			}
		}
		for(int i = 0; i < n; i++) System.out.println(arr[i]);
	}
}
