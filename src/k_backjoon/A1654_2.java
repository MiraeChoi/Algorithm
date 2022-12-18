package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A1654_2 {
	//2 2
	//1
	//10
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int K = Integer.parseInt(st.nextToken());	//K = 2
		int N = Integer.parseInt(st.nextToken());	//N = 2
		int[] arr = new int[K];
		long max = Integer.MIN_VALUE;
		for(int i = 0; i < K; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			max = Math.max(max, arr[i]);
		}
		max++;										//max = 11
		long min = 0, mid = 0;
		while(min < max) {							//0 < 11		6 < 11			6 < 8		6 < 7
			mid = (min + max) / 2;					//mid = 5		mid = 8			mid = 7		mid = 6
			long cnt = 0;
			for(int i = 0; i < arr.length; i++) {
				cnt += arr[i] / mid;				//cnt = 0 + 2	cnt = 0 + 1		cnt = 1		cnt = 1
			}
			if(cnt < N) max = mid;					//				max = 8			max = 7		max = 6
			else min = mid + 1;						//min = 6
			System.out.println(cnt + " / " + mid);
		}
		System.out.println(min - 1);				//											min - 1 = 5
	}
}