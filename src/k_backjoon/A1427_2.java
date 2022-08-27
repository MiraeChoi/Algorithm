package k_backjoon;

import java.io.IOException;
import java.io.InputStream;

class A1427_2 {
	public static void main(String[] args) throws IOException {
		InputStream in = System.in;
		int[] cnt = new int[10];
		int tmp = 0;
		while((tmp = in.read()) != 13) cnt[tmp - '0']++;
		for(int i = 9; i >= 0; i--) {
			while(cnt[i]-- > 0) System.out.print(i);
		}
	}
}