package b_array;

import java.util.Scanner;

class Ex02_10 {
	public int solution(int n, int[][] arr) {
		int answer = 0;
		int[][] tmp = new int[n+2][n+2];
		
		for(int i = 0; i < tmp.length; i++) {
			for(int j = 0; j < tmp.length; j++) {
				if(i == 0 || i == tmp.length-1 || j == 0 || j == tmp.length-1) {
					tmp[i][j] = 0;
				}
				else {
					tmp[i][j] = arr[i-1][j-1];
				}
			}
		}
		
		for(int i = 1; i < tmp.length-1; i++) {
			for(int j = 1; j < tmp.length-1; j++) {
				if(tmp[i][j-1] < tmp[i][j] && tmp[i][j+1] < tmp[i][j] && tmp[i-1][j] < tmp[i][j] && tmp[i+1][j] < tmp[i][j]) {
					answer++;
				}
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex02_10 T = new Ex02_10();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] arr = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				arr[i][j] = kb.nextInt();
			}
		}
		System.out.print(T.solution(n, arr));
	}
}

