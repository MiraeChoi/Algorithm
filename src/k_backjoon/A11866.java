package k_backjoon;

import java.io.IOException;

class A11866 {
	private static int[] arr;
	private static boolean[] ch;
	private static int N, K;
	
	//3번째부터 오류. cnt 상승 x
	private static int curK(int idx) {
		idx++;
		if(idx == N) idx = 0;
		int cnt = 0;
		while(cnt < K) {
			if(idx == N) idx = 0;
			if(!ch[idx]) cnt++;
			idx++;
		}
		idx--;
		for(int i = 0; i < N; i++) {
			if(!ch[i]) System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("idx : " + idx);
		ch[idx] = true;
		return idx;
	}
	
	public static void main(String[] args) throws IOException {
		N = read(); K = read();
		arr = new int[N];
		ch = new boolean[N];
		for(int i = 0; i < N; i++) arr[i] = i + 1;
		StringBuilder sb = new StringBuilder();
		sb.append('<');
		int cur = K - 1;
		ch[cur] = true;
		for(int i = 0; i < N; i++) {
			sb.append(cur).append(',').append(' ');
			cur = curK(cur);
			System.out.println("확인 : " + i);
		}
		sb.append('>');
		System.out.print(sb);
	}
	
	private static int read() throws IOException {
    	int c, n = System.in.read() & 15;
        while ((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
        return n;
	}
}