package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A11053 {
	//시간 초과
	private static int[] arr;
	private static Integer[] dy;
	private static int max;
	
	private static int LIS(int n) {
		if(dy[n] == null) dy[n] = 1;
		for(int i = n - 1; i >= 0; i--) {
			if(arr[i] < arr[n]) dy[n] = Math.max(dy[n], LIS(i) + 1);
		}
		return dy[n];
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		arr = new int[N];
		dy = new Integer[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
		for(int i = 0; i < N; i++) LIS(i);
		max = dy[0];
		for(int i = 1; i < N; i++) max = Math.max(max, dy[i]);
//		for(int i = 0; i < N; i++) System.out.print(dy[i] + " ");
//		System.out.println();
		System.out.println(max);
	}
}