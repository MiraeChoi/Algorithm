package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A2580_2 {
	private static int[][] sudoku = new int[9][9];
	
	private static void solution(int row, int col) {
		if(col == sudoku.length) {
			solution(row + 1, 0);
			return;
		}
		if(row == sudoku.length) {
			for(int i = 0; i < sudoku.length; i++) {
				for(int j = 0; j < sudoku.length; j++) {
					System.out.print(sudoku[i][j] + " ");
				}
				System.out.println();
			}
			System.exit(0);
		}
		if(sudoku[row][col] == 0) {
			for(int i = 1; i <= sudoku.length; i++) {
				if(findNum(row, col, i)) {
					sudoku[row][col] = i;
					solution(row, col + 1);
				}
			}
			sudoku[row][col] = 0;
		}
		solution(row, col + 1);
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
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		for(int i = 0; i < sudoku.length; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < sudoku.length; j++) {
				sudoku[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		solution(0, 0);
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