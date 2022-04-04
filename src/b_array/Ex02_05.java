package b_array;

import java.util.Scanner;

class Ex02_05 {
	//설명
	//자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
	//만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.
	
	//입력
	//첫 줄에 자연수의 개수 N(2<=N<=200,000)이 주어집니다.
	
	//출력
	//첫 줄에 소수의 개수를 출력합니다.
	public int solution(int n) {
		int answer = 0;
		int[] arr = new int[n];
		int count = 0;
		arr[0] = 1;
		
		for(int i = 2; i <= n; i++) {
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					arr[i-1]++;
					break;
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 0) count++;
		}
		
		answer = count;
		return answer;
	}
	
	public static void main(String[] args) {
		Ex02_05 T = new Ex02_05();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.print(T.solution(n));
	}
}
