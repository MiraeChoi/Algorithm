package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class A1149_1 {
	//ex) N=3, »¡ÃÊÆÄ ¼øÀ¸·Î Áý1 26 40 83 / Áý2 49 60 57 / Áý3 13 89 99
	//»¡ÃÊÆÄ »¡ÆÄÃÊ ÃÊ»¡ÆÄ ÃÊÆÄ»¡ ÆÄ»¡ÃÊ ÆÄÃÊ»¡
	//»¡ÃÊ»¡ »¡ÆÄ»¡(V) ÃÊ»¡ÃÊ ÃÊÆÄÃÊ ÆÄ»¡ÆÄ ÆÄÃÊÆÄ
	//Áý1 26 + Áý2 57 + Áý3 13 = 96
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] house = new int[N][3];
		StringTokenizer st;
		for(int i = 0; i < house.length; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < house[i].length; j++) {
				house[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int answer = Integer.MAX_VALUE;
		boolean[] color = new boolean[3];
		int c1 = 0, c2 = 0, c3 = 0;
		for(int i = 0; i < house.length; i++) {
			int idx = i;
			c1 = i;
			int n1 = -1, n2 = -1;
			for(int j = 0; j < 3; j++) {
				if(j != idx) {
					if(n1 != -1) n2 = j;
					else n1 = j;
				}
			}
			c2 = Math.min(n1, n2);
			idx = c2;
			n1 = -1; n2 = -1;
			for(int j = 0; j < 3; j++) {
				if(j != idx) {
					if(n1 != -1) n2 = j;
					else n1 = j;
				}
			}
			c3 = Math.min(n1, n2);
//			color[i] = true;
//			c1 = i;
//			for(int j = 0; j < 3; j++) {
//				if(color[j]) continue;
//				else {
//					color[j] = true;
//					c2 = j;
//				}
//				for(int k = 0; k < 3; k++) {
//					if(color[k]) continue;
//					else {
//						color[k] = true;
//						c3 = k;
//					}
//				}
//			}
			System.out.println("c1 c2 c3 : " + house[0][c1] + " " + house[1][c2] + " " + house[2][c3]);
			answer = Math.min(answer, house[0][c1] + house[1][c2] + house[2][c3]);
			Arrays.fill(color, false);
		}
		System.out.println(answer);
	}
}