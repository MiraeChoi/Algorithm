package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A11053_2 {
	//맞았습니다!!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int[] dy = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
		for(int i = 0; i < N; i++) {
			dy[i] = 1;
			for(int j = 0; j < i; j++) {
				if(arr[i] > arr[j] && dy[j] + 1 > dy[i]) dy[i] = dy[j] + 1;
			}
		}
		int max = 0;
		for(int i = 0; i < N; i++) max = dy[i] > max ? dy[i] : max;
		System.out.println(max);
	}
}