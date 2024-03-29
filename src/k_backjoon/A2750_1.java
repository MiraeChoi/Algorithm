package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A2750_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(br.readLine());
		//���� ����
		for(int i = 0; i < n; i++) {
			int min = arr[i];
			int idx = i;
			for(int j = i; j < n; j++) {
				if(min > arr[j]) {
					min = arr[j];
					idx = j;
				}
			}
			arr[idx] = arr[i];
			arr[i] = min;
			sb.append(arr[i] + "\n");
		}
		System.out.println(sb);
		br.close();
	}
}
