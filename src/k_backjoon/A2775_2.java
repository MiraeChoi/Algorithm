package k_backjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class A2775_2 {
	public static void main(String[] args) {
		try {
			final int SIZE = 15;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			int testCase = Integer.parseInt(br.readLine());
			int[][] house = new int[SIZE][SIZE];
			int k, n;

			for(int i = 0; i < SIZE; i++) {
				for(int j = 0; j < SIZE; j++) {
					if(i == 0) house[i][j] = j+1;
					else if(j == 0) house[i][j] = 1;
					else house[i][j] = house[i][j-1] + house[i-1][j];
				}
			}
			for(int i = 0; i < testCase; i++) {
				k = Integer.parseInt(br.readLine());
				n = Integer.parseInt(br.readLine());
				System.out.println(house[k][n-1]);
			}
			br.close();
		} catch (Exception e) {}
	}
}
