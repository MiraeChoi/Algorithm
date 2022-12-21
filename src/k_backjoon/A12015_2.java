package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A12015_2 {
	//맞았습니다!!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] arr = new int[N];
		int[] LIS = new int[N];
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		LIS[0] = arr[0];
		int lengthLIS = 1;
		for(int i = 0; i < N; i++) {
			if(arr[i] > LIS[lengthLIS - 1]) {
				lengthLIS++;
				LIS[lengthLIS - 1] = arr[i];
			} else {
				int lt = 0, rt = lengthLIS;
				while(lt < rt) {
					int mid = (lt + rt) / 2;
					
					if(LIS[mid] < arr[i]) lt = mid + 1;
					else rt = mid;
				}
				LIS[lt] = arr[i];
			}
		}
		System.out.println(lengthLIS);
	}
}