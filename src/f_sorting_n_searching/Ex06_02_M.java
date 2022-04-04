package f_sorting_n_searching;

import java.util.Scanner;

class Ex06_02_M {
	//설명
	//N개의 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.
	//정렬하는 방법은 버블정렬입니다.
	
	//입력
	//첫 번째 줄에 자연수 N(1<=N<=100)이 주어집니다.
	//두 번째 줄에 N개의 자연수가 공백을 사이에 두고 입력됩니다. 각 자연수는 정수형 범위 안에 있습니다.
	
	//출력
	//오름차순으로 정렬된 수열을 출력합니다.
	public int[] solution(int n, int[] arr) {
		int max = 0;
		
		for(int i = 0; i < n-max;) {
			for(int j = 1; j < n-max; j++) {
				if(arr[j] < arr[i]) {
					int tmp = arr[j];
					arr[j] = arr[i];
					arr[i] = tmp;
				}
				i++;
			}
			i = 0;
			max++;
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		Ex06_02_M T = new Ex06_02_M();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		for(int x : T.solution(n, arr)) System.out.print(x + " ");
	}
}
