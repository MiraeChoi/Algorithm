package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A1037 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < num; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			max = Math.max(max, tmp);
			min = Math.min(min, tmp);
		}
		System.out.println(max * min);
//		out : for(int i = 2; i <= 1000000; i++) {
//			max *= i;
//			for(int j = 0; j < num; j++) {
//				if(max % arr[j] != 0) continue out;
//			}
//			System.out.println(max);
//			break;
//		}
	}
}