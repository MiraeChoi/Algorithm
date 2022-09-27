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
		tmp[p] = arr[p];
		System.out.print("tmp[i] : ");
		for(int i = 0; i < tmp.length; i++) System.out.print(tmp[i] + " ");
		System.out.println();
		cnt++;
		if(p < n-1) {
			if(arr[p] < arr[p+1]) {
				merge_sort(p+1);
			} else {
				System.out.println("ÇÏÀÌ¿°");
				arr[0] = arr[p+1];
				for(int i = 0; i < n-1; i++) {
					if(cnt == n) return;
					cnt++;
					if(tmp[i] == 0) break;
					else {
						arr[i+1] = tmp[i];
						tmp[i] = 0;
						tmp[i] = arr[i];
					}
				}
				System.out.print("arr[i] : ");
				for(int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
				System.out.println();
				System.out.println("cnt : " + cnt);
			}
		} else {
			p = 0;
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
