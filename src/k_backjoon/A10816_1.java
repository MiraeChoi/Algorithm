package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class A10816_1 {
	//시간 초과
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] card = new int[n];
		for(int i = 0; i < n; i++) card[i] = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(br.readLine());
		int[] arr = new int[m];
		st = new StringTokenizer(br.readLine());
		Arrays.sort(arr);
		for(int i = 0; i < m; i++) {
			int num = Integer.parseInt(st.nextToken());
			int cnt = 0;
			for(int j = 0; j < n; j++) {
				if(num == card[j]) {
					while(num != card[j]) {
						cnt++;
						j++;
					}
					break;
				}
			}
			arr[i] = cnt;
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < m; i++) sb.append(arr[i]).append(' ');
		System.out.println(sb);
	}
}