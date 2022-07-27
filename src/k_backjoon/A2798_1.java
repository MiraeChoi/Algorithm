package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A2798_1 {
	//맞았습니다!!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
		int c1 = 0, c2 = 1, c3 = 2;
		int answer = -1;
		while(true) {
			int sum = arr[c1] + arr[c2] + arr[c3];
			System.out.println(c1 + " / " + c2 + " / " + c3);
			if(sum > m) {
				c3++;
				if(c3 == n) {
					c2++;
					c3 = c2 + 1;
					if(c2 == n-1) {
						c1++;
						if(c1 == n-2) break;
						c2 = c1 + 1;
						c3 = c2 + 1;					
					}
				}
				continue;
			}
			if(Math.abs(m - answer) > Math.abs(m - sum)) answer = sum;
			if(answer == m) break;
			c3++;
			if(c3 == n) {
				c2++;
				c3 = c2 + 1;
				if(c2 == n-1) {
					c1++;
					if(c1 == n-2) break;
					c2 = c1 + 1;
					c3 = c2 + 1;					
				}
			}
		}
		System.out.println(answer);
	}
}
