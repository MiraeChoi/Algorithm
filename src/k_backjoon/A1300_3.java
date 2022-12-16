package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A1300_3 {
	//맞았습니다!!
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int k = Integer.parseInt(br.readLine());
		int lt = 1, rt = k;
		
		while(lt < rt) {
			int mid = (lt + rt) / 2;
			int cnt = 0;
			
			for(int i = 1; i <= N; i++) {
				cnt += Math.min(mid / i, N);
			}
			if(cnt >= k) rt = mid;
			else lt = mid + 1;
		}
		System.out.println(lt);
	}
}