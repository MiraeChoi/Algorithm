package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A2798_2 {
	public static int c1 = 0, c2 = 1, c3 = 2, n;
	
	public static boolean swap() {
		c3++;
		if(c3 == n) {
			c2++;
			c3 = c2 + 1;
			if(c2 == n-1) {
				c1++;
				if(c1 == n-2) return false;
				c2 = c1 + 1;
				c3 = c2 + 1;					
			}
		}
		return true;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		int answer = -1;
		while(true) {
			int sum = arr[c1] + arr[c2] + arr[c3];
			if(sum > m) {
				boolean result = swap();
				if(result) continue;
				else break;
			}
			System.out.println(c1 + " / " + c2 + " / " + c3);
			if(Math.abs(m - answer) > Math.abs(m - sum)) answer = sum;
			if(answer == m) break;
			if(!swap()) break;
		}
		System.out.println(answer);
	}
}
