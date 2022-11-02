package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//맞았습니다!!
class A24060_3 {
	public static int[] arr, tmp;
	public static int n, k, cnt = 0, answer = -1;
	
	public static void merge_sort(int p, int r) {
		System.out.println("sort) p r : " + p + " " + r);
		if(cnt > k) return;
		if(p < r) {
			int q = (p + r) / 2;
			merge_sort(p, q);
			merge_sort(q + 1, r);
			merge(p, q, r);
		}
	}
	
	public static void merge(int p, int q, int r) {
		System.out.println("--------- merge ---------");
		System.out.println("p q r : " + p + " " + q + " " + r);
		int i = p;
		int j = q + 1;
		int t = 0;
		while(i <= q && j <= r) {
			if(arr[i] <= arr[j]) {
				tmp[t] = arr[i];
				i++;
			} else {
				tmp[t] = arr[j];
				j++;
			}
			t++;
		}
		while(i <= q) tmp[t++] = arr[i++];
		while(j <= r) tmp[t++] = arr[j++];
		i = p;
		t = 0;
		while(i <= r) {
			cnt++;
			if(cnt == k) {
				answer = tmp[t];
				break;
			} 
			arr[i++] = tmp[t++];
		}
		System.out.print("arr[idx] : ");
		for(int idx = 0; idx < arr.length; idx++) System.out.print(arr[idx] + " ");
		System.out.print("\ntmp[idx] : ");
		for(int idx = 0; idx < tmp.length; idx++) System.out.print(tmp[idx] + " ");
		System.out.println();
		System.out.println("-------------------------");
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
		merge_sort(0, n-1);
		System.out.println(answer);
	}
}