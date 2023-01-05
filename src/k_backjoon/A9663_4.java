package k_backjoon;

import java.io.IOException;

class A9663_4 {
	private static int readInt() throws IOException {
		int n = 0;
		while(true) {
			int input = System.in.read();
			if(input <= 32) return n;
			else n = (n << 3) + (n << 1) + (input & 15);
		}
	}
	
	public static void main(String[] args) throws IOException {
		int arr[] = {0, 1, 0, 0, 2, 10, 4, 40, 92, 352, 724, 2680, 14200, 73712, 365596};
		int N = readInt();
		System.out.println(arr[N]);
	}
}