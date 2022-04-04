package b_array;

import java.util.Scanner;

class Ex02_09_Review {
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
		int sum1 = 0, sum2 = 0, sum3 = 0, sum4 = 0;
		
		for(int i = 0; i < n; i++) {
			sum1 = 0; sum2 = 0;
			
			sum3 += arr[i][i];
			sum4 += arr[i][n-i-1];
			
			for(int j = 0; j < n; j++) {
				sum1 += arr[i][j];
				sum2 += arr[j][i];
			}
			
			if(sum1 > answer) answer = sum1;
			if(sum2 > answer) answer = sum2;
		}
		
		if(sum3 > answer) answer = sum3;
		if(sum4 > answer) answer = sum4;
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex02_09_Review T = new Ex02_09_Review();
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
