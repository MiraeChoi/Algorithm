package k_backjoon;

import java.io.IOException;

class A2580_2 {
	private static int[] arr = new int[9];
	private static int[][] sudoku = new int[9][9];
	
	private static void solution(int L) {
		if(L == sudoku.length) {
			
		} else {
			for(int i = 0; i < sudoku.length; i++) {
				if(sudoku[L][i] > 0) arr[sudoku[L][i]]++;
				else {
					findNum(i);
					solution(L + 1);
				}
			}
		}
	}
	
	private static void findNum(int idx) {
		for(int i = 0; i < sudoku.length; i++) {
			if(arr[i] == 0) sudoku[idx][i] = idx;
		}
	}
	
	public static void main(String[] args) throws IOException {
		for(int i = 0; i < sudoku.length; i++) {
			for(int j = 0; j < sudoku.length; j++) {
				sudoku[i][j] = readInt();
			}
		}
		solution(0);
		for(int i = 0; i < sudoku.length; i++) {
			for(int j = 0; j < sudoku.length; j++) {
				System.out.print(sudoku[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	private static int readInt() throws IOException {
		int n = 0;
		while(true) {
			int input = System.in.read();
			if(input <= 32) return n;
			else n = (n << 3) + (n << 1) + (input & 15);
		}
	}
}