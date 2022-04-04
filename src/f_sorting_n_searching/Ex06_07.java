package f_sorting_n_searching;

import java.util.Scanner;

class Ex06_07 {
	//설명
	//N개의 평면상의 좌표(x, y)가 주어지면 모든 좌표를 오름차순으로 정렬하는 프로그램을 작성하세요.
	//정렬기준은 먼저 x값의 의해서 정렬하고, x값이 같을 경우 y값에 의해 정렬합니다.
	
	//입력
	//첫째 줄에 좌표의 개수인 N(3<=N<=100,000)이 주어집니다.
	//두 번째 줄부터 N개의 좌표가 x, y 순으로 주어집니다. x, y값은 양수만 입력됩니다.
	
	//출력
	//N개의 좌표를 정렬하여 출력하세요.
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
