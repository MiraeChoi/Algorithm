package k_backjoon;

import java.io.IOException;
import java.util.Arrays;

class A1920_2 {
	public static void main(String args[]) throws Exception {
    	int n = readInt();
    	int[] arr = new int[n];
    	for(int i = 0; i < n; i++) arr[i] = readInt();
    	Arrays.sort(arr);
        int m = readInt();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < m; i++) sb.append(Arrays.binarySearch(arr, readInt()) < 0 ? 0 : 1).append('\n');
        System.out.println(sb);
	}
	
	private static int readInt() throws IOException {
		int n = 0;
		boolean isNegative = false;
		while(true) {
			int input = System.in.read();
			if(input <= 32) return isNegative ? n * -1 : n;
			else if(input == '-') isNegative = true;
			else n = (n << 3) + (n << 1) + (input & 15);
		}
	}
}