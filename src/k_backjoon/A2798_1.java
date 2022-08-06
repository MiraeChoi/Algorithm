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
		
		int n1 = 0, n2 = 1, n3 = 2;
		int answer = 0;
		
		while(n1 < n-2) {
			int sum = arr[n1] + arr[n2] + arr[n3];
			if(sum == m) {
				System.out.println(m);
				return;
			} else if(sum < m) {
				answer = Math.max(answer, sum);
			}
			n3++;
			if(n3 >= n) {
				n2++;
				n3 = n2 + 1;
				if(n2 >= n-1) {
					n1++;
					n2 = n1 + 1;
					n3 = n2 + 1;
				}
			}
		}
		System.out.println(answer);
	}
}
