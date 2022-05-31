package k_backjoon;

import java.io.IOException;

class A1157_3 {
	public static void main(String[] args) throws IOException {
		int[] arr = new int[26];
		int c, max = 0, maxa = -2;
		
		while ((c = System.in.read()) > 64) {
			arr[c -= c < 96 ? 65 : 97]++;
			
			if (max < arr[c]) {
				max = arr[c];
				maxa = c;
			} else if (max == arr[c])
				maxa = -2;
		}
		System.out.print((char)(maxa + 65));
	}
}
