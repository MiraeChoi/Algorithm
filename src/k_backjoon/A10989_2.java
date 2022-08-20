package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A10989_2 {
	public static void main(String[] args) throws IOException {
		//카운팅 정렬
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			max = Math.max(max, arr[i]);
		}
		
		int[] count = new int[max + 1];
		for(int i = 0; i < n; i++) count[arr[i]]++;
		for(int i = 1; i < count.length; i++) count[i] = count[i-1] + count[i];
		
		int[] result = new int[n];
		for(int i = n-1; i >= 0; i--) {
			int tmp = count[arr[i]]--;
			result[--tmp] = arr[i];
		}
		for(int i = 0; i < n; i++) sb.append(result[i] + "\n");
		System.out.println(sb);
		br.close();
	}
}
