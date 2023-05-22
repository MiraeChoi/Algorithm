package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A1149_2 {
	//맞았습니다!!
	private static int R = 0, G = 1, B = 2;
	private static int[][] house, dy;
	
	private static int solution(int n, int color) {
		if(dy[n][color] == 0) {
			if(color == R) dy[n][R] = Math.min(solution(n-1, G), solution(n-1, B)) + house[n][R];
			else if(color == G) dy[n][G] = Math.min(solution(n-1, R), solution(n-1, B)) + house[n][G];
			else dy[n][B] = Math.min(solution(n-1, R), solution(n-1, G)) + house[n][B];
		}
		return dy[n][color];
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		house = new int[N][3];
		dy = new int[N][3];
		StringTokenizer st;
		for(int i = 0; i < house.length; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < house[i].length; j++) {
				house[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		dy[0][R] = house[0][R];
		dy[0][G] = house[0][G];
		dy[0][B] = house[0][B];
		System.out.println(Math.min(solution(N-1, R), Math.min(solution(N-1, G), solution(N-1, B))));
	}
}