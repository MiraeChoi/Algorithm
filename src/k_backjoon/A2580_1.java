package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A2580_1 {
	private static int[][] sudoku = new int[9][9];
	
	private static void solution() {
		for(int i = 0; i < sudoku.length; i++) {
			boolean[] check = new boolean[9];
			int idx_i = -1, idx_j = -1;
			for(int j = 0; j < sudoku[i].length; j++) {
				if(sudoku[i][j] == 0) {
					idx_i = i;
					idx_j = j;
				} else {
					check[sudoku[i][j] - 1] = true;
				}
			}
			System.out.println("idx_i & j : " + idx_i + " / " + idx_j);
			if(idx_i >= 0) {
				for(int k = 0; k < check.length; k++) {
					if(!check[k]) {
						sudoku[idx_i][idx_j] = k + 1;
					}
				}
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i = 0; i < sudoku.length; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < sudoku[i].length; j++) {
				sudoku[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		solution();
		for(int i = 0; i < sudoku.length; i++) {
			for(int j = 0; j < sudoku[i].length; j++) {
				System.out.print(sudoku[i][j] + " ");
			}
			System.out.println();
		}
	}
}
