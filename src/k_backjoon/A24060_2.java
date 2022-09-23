package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A24060_2 {
	public static int[] arr, tmp;
	public static int n, k, cnt = 0;
	
	private static void merge_sort(int p) {
		if(cnt == n) return;
		cnt++;
		if(p < n-1) {
			tmp[p] = arr[p];
			if(arr[p] < arr[p+1]) {
				merge_sort(p+1);
			} else {
				for(int i = 0; i < n; i++) {
					if(cnt == n) return;
					cnt++;
					if(tmp[i] == 0) break;
					else arr[i] = tmp[i];
				}
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		arr = new int[n];
		tmp = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
		merge_sort(0);
		System.out.println(arr[k % n]);
	}
}
