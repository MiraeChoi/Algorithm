package f_sorting_n_searching;

import java.util.Arrays;
import java.util.Scanner;

class Ex06_10 {
	//설명
	//N개의 마구간이 수직선상에 있습니다. 각 마구간은 x1, x2, x3, ......, xN의 좌표를 가지며, 마구간간에 좌표가 중복되는 일은 없습니다.
	//현수는 C마리의 말을 가지고 있는데, 이 말들은 서로 가까이 있는 것을 좋아하지 않습니다. 각 마구간에는 한 마리의 말만 넣을 수 있고,
	//가장 가까운 두 말의 거리가 최대가 되게 말을 마구간에 배치하고 싶습니다.
	//C마리의 말을 N개의 마구간에 배치했을 때 가장 가까운 두 말의 거리가 최대가 되는 그 최대값을 출력하는 프로그램을 작성하세요.
	
	//입력
	//첫 줄에 자연수 N(3<=N<=200,000)과 C(2<=C<=N)이 공백을 사이에 두고 주어집니다.
	//둘째 줄에 마구간의 좌표 xi(0<=xi<=1,000,000,000)가 차례로 주어집니다.
	
	//출력
	//첫 줄에 가장 가까운 두 말의 최대 거리를 출력하세요.
	public int solution(int n, int c, int[] arr) {
		int answer = 0;
		Arrays.sort(arr);
		int[] horse = new int[c];
		horse[0] = arr[0];
		horse[c-1] = arr[n-1];
		if(c == 2) return horse[c-1]-horse[0];
		
		int lt = 0, rt = arr[n-1], mid = n/2;
		for(int i = 1; i < n-1; i++) {
			if(arr[i]-arr[i-1] > arr[i+1]-arr[i]) {
				answer++;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Ex06_10 T = new Ex06_10();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int c = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		System.out.println(T.solution(n, c, arr));
	}
}
