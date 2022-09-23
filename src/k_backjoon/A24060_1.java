package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A24060_1 {
	public static void merge_sort(int[] arr, int p, int r) {
		System.out.println("p & r : " + p + " " + r);
		if(p < r) {
			int q = (p + r) / 2;
			merge_sort(arr, p, q);
			System.out.println("merge_sort 1");
			for(int idx = 0; idx < arr.length; idx++) {
				System.out.print(arr[idx] + " ");
			}
			System.out.println();
			merge_sort(arr, q + 1, r);
			System.out.println("merge_sort 2");
			for(int idx = 0; idx < arr.length; idx++) {
				System.out.print(arr[idx] + " ");
			}
			System.out.println();
			merge(arr, p, q, r);
		}
	}
	
	public static void merge(int[] arr, int p, int q, int r) {
		System.out.println("★p q r : " + p + " " + q + " " + r);
		int i = p, j = q + 1, t = 1;
		int[] tmp = new int[arr.length];
		while(i <= q && j <= r) {
			if(arr[i] <= arr[j]) tmp[t++] = arr[i++];
			else tmp[t++] = arr[j++];
		}
		System.out.println("tmp[t++] : " + tmp[t]);
		System.out.println("arr[j++] : " + arr[j]);
		System.out.println("iIiIiIi : " + i);
		System.out.println("TtTtTtT : " + t);
		while(i <= q) tmp[t++] = arr[i++];
		while(j <= r) tmp[t++] = arr[j++];
		System.out.println("i & t : " + i + " & " + t);
		while(i <= r) arr[i++] = tmp[t++];
		System.out.println("------------------------");
		System.out.println("중간 결산");
		System.out.print("arr : ");
		for(int idx = 0; idx < arr.length; idx++) {
			System.out.print(arr[idx] + " ");
		}
		System.out.print("\ntmp : ");
		for(int idx = 0; idx < arr.length; idx++) {
			System.out.print(tmp[idx] + " ");
		}
		System.out.println("\n------------------------");
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
		System.out.println(arr[k % n]);
	}
}
