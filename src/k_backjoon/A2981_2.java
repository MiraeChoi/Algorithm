package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A2981_2 {
	//시간 초과
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
		}
		StringBuilder sb = new StringBuilder();
		out : for(int i = 2; i <= max; i++) {
			int rem = min % i;
//			if(i > min && rem != min) continue; 인덱스 지정해서 min을 넘을 때마다 idx++하면...?
			for(int j = 1; j < N; j++) {
				if(arr[j] % i != rem) continue out;
			}
			sb.append(i).append(' ');
		}
		System.out.println("6 % 10 = " + (6 % 10));
		System.out.println(sb);
	}
}