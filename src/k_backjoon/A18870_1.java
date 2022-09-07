package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A18870_1 {
	//시간 초과 ㅠㅠ
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		for(int i = 0; i < n; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			arr[i] = tmp;
			max = Math.max(max, tmp);
			min = Math.min(min, tmp);
		}
		System.out.println(max + " / " + min);
		int[] res = new int[n];
		for(int i = 0; i < n; i++) res[i] = Integer.MAX_VALUE;
		int val = 0;
		for(int i = min - min; i <= max - min; i++) {
			int cnt = 0;
			for(int j = 0; j < n; j++) {
				System.out.println("arr[" + j + "] : " + arr[j]);
				if(arr[j] - min == i && res[j] == Integer.MAX_VALUE) {
					cnt++;
					res[j] = val;
				}
			}
			if(cnt > 0) val++;
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			sb.append(res[i]).append(' ');
		}
		System.out.println(sb);
	}
}
