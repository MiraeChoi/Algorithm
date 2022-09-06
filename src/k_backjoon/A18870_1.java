package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A18870_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
		}
//		int[] res = new int[n];
//		for(int i = 0; i < n; i++) {
//			int cnt = 0;
//			for(int j = 0; j < n; j++) {
//				if(i != j) {
//					if(arr[i] > arr[j]) cnt++;
//				}
//			}
//			res[i] = cnt;
//		}
		int[] cnt = new int[max - min + 1];
		System.out.println("min : " + min);
		for(int i = 0; i < n; i++) cnt[arr[i] - min]++;
		
		int[] res = new int[n];
		int num = 0;
		for(int i = 0; i <= max - min; i++) {
			if(cnt[i] > 0) {
				res[cnt[arr[i] - min]] = num;
				num++;
			}
		}
		
//		for(int i = 1; i < cnt.length; i++) cnt[i] += cnt[i-1];
//		int[] res = new int[n];
//		for(int i = n-1; i >= 0; i--) res[--cnt[arr[i] - min]] = arr[i];
//		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) System.out.print(res[i] + " ");
		for(int i = 0; i < n; i++) {
			sb.append(arr[res[i]]).append(' ');
		}
		System.out.println(sb);
	}
}
