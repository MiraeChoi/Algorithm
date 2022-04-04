package b_array;

import java.util.Scanner;

class Ex02_09_T {
	//설명
	//5*5 격자판에 아래롸 같이 숫자가 적혀 있습니다.
	//(그림 1)
	//N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.
	
	//입력
	//첫 줄에 자연수 N이 주어진다.(2<=N<=50)
	//두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.
	
	//출력
	//최대합을 출력합니다.
	public int solution(int n, int[][] arr) {
		int answer = 0;
		int sum1, sum2;
		
		for(int i = 0; i < n; i++) {
			sum1 = sum2 = 0;
			
			for(int j = 0; j < n; j++) {
				sum1 += arr[i][j];
				sum2 += arr[j][i];
			}
			
			answer = Math.max(answer, sum1);
			answer = Math.max(answer, sum2);
		}
		
		sum1 = sum2 = 0;
		
		for(int i = 0; i < n; i++) {
			sum1 += arr[i][i];
			sum2 += arr[i][n-i-1];
		}
		
		answer = Math.max(answer, sum1);
		answer = Math.max(answer, sum2);
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex02_09_T T = new Ex02_09_T();
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
