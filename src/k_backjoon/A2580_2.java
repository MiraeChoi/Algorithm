package k_backjoon;

import java.io.IOException;

class A2580_2 {
	private static int[] arr = new int[9];
	private static int[][] sudoku = new int[9][9];
	
	private static void solution(int row, int col) {
		if(col == sudoku.length) {
			
		} else {
			for(int i = 0; i < sudoku.length; i++) {
				if(sudoku[col][i] > 0) arr[sudoku[col][i]]++;
				else {
					findNum(0, i, col);
					solution(row, col + 1);
				}
			}
		}
	}
	
	private static boolean findNum(int row, int col, int num) {
		for(int i = 0; i < 9; i++) {
			if(sudoku[row][i] == num) return false;
		}
		for(int i = 0; i < 9; i++) {
			if(sudoku[i][col] == num) return false;
		}
		
		int curRow = row / 3 * 3;
		int curCol = col / 3 * 3;
		
		for(int i = curRow; i < curRow + 3; i++) {
			for(int j = curCol; j < curCol + 3; j++) {
				if(sudoku[i][j] == num) return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) throws IOException {
		for(int i = 0; i < sudoku.length; i++) {
			for(int j = 0; j < sudoku.length; j++) {
				sudoku[i][j] = readInt();
			}
		}
		solution(0, 0);
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