package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A12015_3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int[] C = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int size = 0;
		for(int i = 0; i < N; i++) {
			int lt = 0;
			int rt = size - 1;
			
			while(lt <= rt) {
				int mid = (lt + rt) >> 1;
				int val = C[mid];
				
				if(val < arr[i]) lt = mid + 1;
				else if(val > arr[i]) rt = mid - 1;
				else {
					lt = -1;
					break;
				}
			}
			if(lt == -1) continue;
			C[lt] = arr[i];
			if(lt == size) size++;
		}
		System.out.println(size);
	}
}