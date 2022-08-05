package k_backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class A2447_3 {
	static char[][] star;
	
	static void makeStar(int x, int y, int num, boolean bn) {
		if(bn) {
			for(int i = x; i < x + num; i++) {
				for(int j = y; j < y + num; j++) star[i][j] = ' ';
			}
			return;
		}
		if(num == 1) return;
		int size = num / 3;
		int cnt = 0;
		for(int i = x; i < x + num; i += size) {
			for(int j = y; j < y + num; j += size) {
				star[i][j] = '*';
				cnt++;
				if(cnt == 5) makeStar(i, j, size, true);
				else makeStar(i, j, size, false);
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		star = new char[num][num];
		makeStar(0, 0, num, false);
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num; j++) {
				bw.write(star[i][j]);
			}
			bw.newLine();
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
