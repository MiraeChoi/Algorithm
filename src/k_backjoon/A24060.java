package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A24060 {
	public static void merge_sort(int[] arr, int p, int r) {
		if(p < r) {
			int q = (p + r) / 2;
			merge_sort(arr, p, q);
			merge_sort(arr, q + 1, r);
			merge(arr, p, q, r);
		}
	}
	
	public static void merge(int[] arr, int p, int q, int r) {
		int i = p, j = q + 1, t = 1;
		int[] tmp = new int[arr.length];
		while(i <= q && j <= r) {
			if(arr[i] <= arr[j]) tmp[t++] = arr[i++];
			else tmp[t++] = arr[j++];
		}
		while(i <= q) tmp[t++] = arr[i++];
		while(j <= r) tmp[t++] = arr[j++];
		while(i <= r) arr[i++] = tmp[t++];
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
		merge_sort(arr, 0, n-1);
	}
}
