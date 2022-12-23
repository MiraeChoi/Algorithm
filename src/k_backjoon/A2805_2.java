package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A2805_2 {
	//맞았습니다!!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine(), " ");
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			max = Math.max(max, arr[i]);
		}
		max++;
        int min = 0, mid = 0;
        while(min < max) {
            mid = (min + max) / 2;
            long cnt = 0;
            for(int i = 0; i < arr.length; i++) {
            	if(arr[i] - mid > 0) cnt += (arr[i] - mid);
            }
			if(cnt < M) max = mid;
            else min = mid + 1;
		}
		System.out.println(min - 1);
	}
}