package k_backjoon;

import java.io.IOException;

class A2805_3 {
	private static int read() throws IOException {
		int c, n = System.in.read() & 15;
		while((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
		return n;
	}
	
	public static void main(String[] args) throws IOException {
		int N = read(), M = read(), min = 0, max = 0;
		int[] map = new int[N];
		
		for(int i = 0; i < N; i++) {
			if(max < (map[i] = read())) max = map[i];
		}
		
		int answer = 0;
		while(min <= max) {
			int mid = (min + max) / 2;
			long tmp = 0;
			for(int i = 0; i < N; i++) {
				tmp += (map[i] > mid) ? map[i] - mid : 0; 
			}
			if(tmp >= M) {
				answer = Math.max(mid, answer);
				min = mid + 1;
			} else max = mid - 1;
		}
		System.out.println(answer);
	}
}