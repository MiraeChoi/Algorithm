package b_array;

import java.util.Scanner;

class Ex02_12 {
	public int solution(int n, int m, int[][] arr) {
		int answer = 0;
		
		if(n <= 1) {
			return answer;
		}
		
		int a = 1;
		int b = 2;
		
		while(a <= n) {
			int cnt = 0;
			
			for(int i = 1; i <= m; i++) {
				for(int j = 1; j <= n; j++) {
					for(int k = 1; k <= n; k++) {
						if(arr[i][j] == a && arr[i][k] == b) {
							if(j > k) cnt++;
						}
					}
				}
				
				if(cnt == m) {
                	answer++;
                  	cnt = 0;
                }
			}
			
			b++;
			
			if(b > n) {
				a++;
				b = 1;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex02_12 T = new Ex02_12();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[][] arr = new int[m+1][n+1];
		
		for(int i = 1; i <= m; i++) {
			for(int j = 1; j <= n; j++) {
				arr[i][j] = kb.nextInt();
			}
		}
		
		System.out.print(T.solution(n, m, arr));
	}
}

