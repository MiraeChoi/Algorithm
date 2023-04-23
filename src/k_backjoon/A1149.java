package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A1149 {
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
		int answer = 0;
		for(int i = 0; i < house.length; i++) {
			for(int j = 0; j < house[i].length; j++) {
				
			}
		}
		System.out.println(answer);
	}
}