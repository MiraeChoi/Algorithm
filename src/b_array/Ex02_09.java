package b_array;

import java.util.ArrayList;
import java.util.Scanner;

class Ex02_09 {
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
		ArrayList<Integer> tmp = new ArrayList<>();
		
		int hl = 0; //가로
		int vl = 0; //세로
		int dl = 0; //대각선
		int dl2 = 0; //역대각선
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(i == j) {
					dl += arr[i][j];
				}
				if(i+j == n-1) {
					dl2 += arr[i][j];
				}
				
				hl += arr[i][j];
				vl += arr[j][i];
			}
			
			if(hl > 0) tmp.add(hl);
			if(vl > 0) tmp.add(vl);
			hl = 0;
			vl = 0;
		}
		
		if(dl > 0) tmp.add(dl);
		if(dl2 > 0) tmp.add(dl2);
		
		answer = tmp.get(0);
		
		for(int i = 0; i < tmp.size(); i++) {
			if(tmp.get(i) > answer) answer = tmp.get(i);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex02_09 T = new Ex02_09();
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
