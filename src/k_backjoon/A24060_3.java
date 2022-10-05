package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//5 7
//4 5 1 3 2
class A24060_3 {
	public static int[] arr, tmp;					//arr = {4 5 1 3 2}, tmp = {0 0 0 0 0}																	tmp = {4 5 0 0 0}																arr = {1 5 1 3 2}, tmp = {1 5 1 0 0}
	public static int n, k, cnt = 0, answer = 0;
	
	public static void merge_sort(int p, int r) {	//p = 0, r = 5-1 = 4	p = 0, r = 2		p = 0, r = 1												p = 0, r = 2
		if(cnt > k) return;
		if(p < r) {									//0 < 4					0 < 2				0 < 1
			int q = (p + r) / 2;					//q = (0+4)/2 = 2		q = (0+2)/2 = 1		q = (0+1)/2 = 0
			merge_sort(p, q);						//merge_sort(0, 2)		merge_sort(0, 1)	merge_sort(0, 0) -> return
			merge_sort(q + 1, r);					//											merge_sort(0+1, 1) -> return								merge_sort(1+1, 2) -> return
			merge(p, q, r);							//											merge(0, 0, 1)												merge(0, 1, 2)
		}
	}
	
	public static void merge(int p, int q, int r) {												//p = 0, q = 0, r = 1										p = 0, q = 1, r = 2
		int i = p, j = q + 1, t = 0;															//i = 0, j = 0+1 = 1, t = 0									i = 0, j = 1+1 = 2, t = 0
		System.out.println("p=" + p + ", q=" + q + ", r=" + r);
		while(i <= q && j <= r) {																//0 <= 0 && 1 <= 1											0 <= 1 && 2 <= 2
			if(arr[i] <= arr[j]) tmp[t++] = arr[i++];											//(arr[0] <= arr[1] -> 4 <= 5) tmp[0++] = arr[0++] = 4		(arr[0] <= arr[2] -> 4 > 1
			else tmp[t++] = arr[j++];															//															tmp[0++] = arr[2++] = 1
		}																						//t = 1, i = 1												t = 1, j = 3
		System.out.println("t=" + t + ", i=" + i + ", j=" + j);
		while(i <= q) tmp[t++] = arr[i++];														//(1 > 0)													(0 <= 1) tmp[1++] = arr[0++] = 4
		while(j <= r) tmp[t++] = arr[j++];														//(1 <= 1) tmp[1++] = arr[1++] = 5							(3 > 2)
		i = p; t = 0;																			//i = 0, t = 0 / j = 2										i = 0, t = 0
		while(i <= r) {																			//(0 <= 1)							(1 <= 1)				(0 <= 2)					(1 <= 2)					(2 <= 2)
			cnt++;																				//cnt = 1							cnt = 2					cnt = 3						cnt = 4						cnt = 5
			if(cnt == k) {
				answer = tmp[t];
				break;
			}
			arr[i++] = tmp[t++];																//arr[0++] = tmp[0++] = 4			arr[1++] = tmp[1++] = 5	arr[0++] = tmp[0++] = 1		arr[1++] = tmp[1++] = 5		arr[2++] = tmp[2++] = 1
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
		merge_sort(0, n-1);
		System.out.println(answer);
	}
}
