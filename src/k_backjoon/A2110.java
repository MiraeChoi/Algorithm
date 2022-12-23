package k_backjoon;

import java.io.IOException;
import java.util.Arrays;

class A2110 {
	//맞았습니다!!
	private static int read() throws IOException {
		int c, n = System.in.read() & 15;
		while ((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
		return n;
	}
	
	public static void main(String[] args) throws IOException {
		int N = read(), C = read();
		int[] house = new int[N];
		for(int i = 0; i < N; i++) house[i] = read();
		Arrays.sort(house);
		
		int min = 0, max = house[N-1] - house[0] + 1;
		while(min < max) {
			int mid = (min + max) / 2;
			int cnt = 1, lastHouse = house[0];
			
			for(int i = 1; i < N; i++) {
				if(house[i] - lastHouse >= mid) {
					cnt++;
					lastHouse = house[i];
				}
			}
			if(cnt < C) max = mid;
			else min = mid + 1;
		}
		System.out.println(min - 1);
	}
}