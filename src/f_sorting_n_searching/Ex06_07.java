package f_sorting_n_searching;

import java.util.Scanner;

class Ex06_07 {
	public int[][] solution(int n, int[][] arr) {
		int[] x = new int[n];
		int[] y = new int[n];
		
		for(int i = 0; i < x.length; i++) x[i] = arr[i][0];
		for(int i = 0; i < x.length; i++) y[i] = arr[i][1];
		
		for(int i = 0; i < n-1; i++) {
			if(x[i] > x[i+1]) {
				int tmpx = x[i];
				x[i] = x[i+1];
				x[i+1] = tmpx;
				
				int tmpy = y[i];
				y[i] = y[i+1];
				y[i+1] = tmpy;
			}
		}
		
		for(int i = 0; i < n-1; i++) {
			if(x[i] == x[i+1] && y[i] > y[i+1]) {
				int tmpx = x[i];
				x[i] = x[i+1];
				x[i+1] = tmpx;
				
				int tmpy = y[i];
				y[i] = y[i+1];
				y[i+1] = tmpy;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			arr[i][0] = x[i];
			arr[i][1] = y[i];
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		Ex06_07 T = new Ex06_07();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] arr = new int[n][2];
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = kb.nextInt();
			}
		}
		
		int[][] ans = T.solution(n, arr).clone();
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}
	}
}
