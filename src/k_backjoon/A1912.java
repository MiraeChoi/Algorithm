package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A1912 {
	//Æ²·È½À´Ï´Ù.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
		int answer = 0;
		int cnt = 0;
		for(int i = 0; i < n; i++) {
			int lt = 0, rt = 0 + i;
			for(int j = lt; j < n; j++) {
				cnt += arr[j];
				lt++; rt++;
			}
			if(cnt + arr[i] > cnt && cnt + arr[i] > arr[i]) cnt += arr[i];
			else cnt = arr[i];
			answer = Math.max(answer, cnt);
		}
		System.out.println(answer);
	}
}