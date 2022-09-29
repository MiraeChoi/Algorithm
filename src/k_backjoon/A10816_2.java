package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class A10816_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] numSave = new int[20000000];
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] card = new int[n];
		for(int i = 0; i < n; i++) {
			card[i] = Integer.parseInt(st.nextToken());
			numSave[card[i] + 10000000]++;
		}
		int m = Integer.parseInt(br.readLine());
		int[] arr = new int[m];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < m; i++) {
			int num = Integer.parseInt(st.nextToken());
			arr[i] = numSave[num + 10000000];
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < m; i++) sb.append(arr[i]).append(' ');
		System.out.println(sb);
	}
}