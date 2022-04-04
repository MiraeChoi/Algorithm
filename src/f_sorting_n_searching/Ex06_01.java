package f_sorting_n_searching;

import java.util.Arrays;
import java.util.Scanner;

class Ex06_01 {
	//설명
	//N개의 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.
	//정렬하는 방법은 선택정렬입니다.
	
	//입력
	//첫 번째 줄에 자연수 N(1<=N<=100)이 주어집니다.
	//두 번째 줄에 N개의 자연수가 공백을 사이에 두고 입력됩니다. 각 자연수는 정수형 범위 안에 있습니다.
	
	//출력
	//오름차순으로 정렬된 수열을 출력합니다.
	public int[] solution(int n, int[] arr) {
		int[] answer = new int[n];
		for(int i = 0; i < arr.length; i++) answer[i] = arr[i];
		Arrays.sort(answer);
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex06_01 T = new Ex06_01();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++) arr[i] = kb.nextInt();
		for(int x : T.solution(n, arr)) System.out.print(x + " ");
	}
}
