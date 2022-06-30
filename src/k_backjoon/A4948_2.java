package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A4948_2 {
	static final int MAX = 123457 * 2;
	static boolean isPrime[] = new boolean[MAX];
	static int prime[] = new int[21790];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int size = setPrime();
		while(true) {
			int input = Integer.parseInt(br.readLine());
			if(input == 0) break;
			int idx1 = binarySearch(input, size);
			int idx2 = binarySearch(input * 2, size);
			
			if(prime[idx2] == input * 2) idx2++;
			else if(prime[idx1] == input) idx1++;
			sb.append((idx2 - idx1)).append("\n");
		}
		System.out.println(sb);
	}

	public static int binarySearch(int num, int size) {
		int start = 1;
		int end = size - 1;
		while(start <= end) {
			int center = (start + end) / 2;
			if(prime[center] >= num) end = center - 1;
			else start = center + 1;
		}
		return start;
	}

	public static int setPrime() {
		int idx = 1;
		for(int i = 2; i < MAX; i++) {
			if(!isPrime[i]) {
				prime[idx++] = i;
				for(int j = i; j < MAX; j += i) isPrime[j] = true;
			}
		}
		return idx;
	}
}