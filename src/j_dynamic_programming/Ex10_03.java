package j_dynamic_programming;

import java.util.Scanner;

class Ex10_03 {
	//설명
	//N개의 자연수로 이루어진 수열이 주어졌을 때, 그 중에서 가장 길게 증가하는(작은 수에서 큰 수로) 원소들의 집합을 찾는 프로그램을 작성하라.
	//예를 들어, 원소가 2, 7, 5, 8, 6, 4, 7, 12, 3 이면 가장 길게 증가하도록 원소들을 차례대로 뽑아내면 2, 5, 6, 7, 12를 뽑아내어
	//길이가 5인 최대 부분 증가수열을 만들 수 있다.
	
	//입력
	//첫째 줄은 입력되는 데이터의 수 N(3≤N≤1,000, 자연수)를 의미하고,
	//둘째 줄은 N개의 입력데이터들이 주어진다.
	
	//출력
	//첫 번째 줄에 부분증가수열의 최대 길이를 출력한다.
	static int[] arr, dy;
	
	public int solution(int n) {
		dy[1] = 1;
		
		for(int i = 2; i <= n; i++) {
			if(arr[i] > arr[i-1]) dy[i] = dy[i-1] + 1;
			else dy[i] = dy[i-1];
		}
		for(int i = 1; i <= n; i++) {
			System.out.print(dy[i] + " ");
		}
		System.out.println();
		return dy[n];
	}
	
	public static void main(String[] args) {
		Ex10_03 T = new Ex10_03();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		arr = new int[n+1];
		dy = new int[n+1];
		for(int i = 1; i <= n; i++) arr[i] = kb.nextInt();
		System.out.println(T.solution(n));
	}
}
