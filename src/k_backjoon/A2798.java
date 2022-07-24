package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A2798 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
		int c1, c2, c3;
		c2 = n / 2;
		c1 = c2 - 1;
		c3 = c2 + 1;
		int answer = 0;
		for(int i = 0; i < n; i++) {
			answer = arr[c1] + arr[c2] + arr[c3];
			if(answer == m) break;
			else if(answer > m) {
				
			}
			else if(answer < m) {
				
			}
		}
		System.out.println(answer);
	}
}
