package c_pointers_n_window;

import java.util.ArrayList;
import java.util.Scanner;

class Ex03_01 {
	//설명
	//오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성하세요.
	
	//입력
	//첫 번째 줄에 첫 번째 배열의 크기 N(1<=N<=100)이 주어집니다.
	//두 번째 줄에 N개의 배열 원소가 오름차순으로 주어집니다.
	//세 번째 줄에 두 번째 배열의 크기 M(1<=M<=100)이 주어집니다.
	//네 번째 줄에 M개의 배열 원소가 오름차순으로 주어집니다.
	//각 리스트의 원소는 int형 변수의 크기를 넘지 않습니다.
	
	//출력
	//오름차순으로 정렬된 배열을 출력합니다.
	public int[] solution(int n, int[] nArr, int m, int[] mArr) {
		int[] answer = new int[n+m];
		ArrayList<Integer> temp = new ArrayList<>();
		
		for(int i = 0; i < nArr.length; i++) {
			temp.add(nArr[i]);
		}
		for(int i = 0; i < mArr.length; i++) {
			temp.add(mArr[i]);
		}
		
		for(int i = 0; i < answer.length; i++) {
			int min = Integer.MAX_VALUE;
			int index = 0;
			
			for(int j = 0; j < temp.size(); j++) {
				if(temp.get(j) < min) {
					min = temp.get(j);
					index = j;
				}
			}
			
			answer[i] = min;
			temp.remove(index);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Ex03_01 T = new Ex03_01();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int[] nArr = new int[n];
		for(int i = 0; i < nArr.length; i++) nArr[i] = kb.nextInt();
		
		int m = kb.nextInt();
		int[] mArr = new int[m];
		for(int i = 0; i < mArr.length; i++) mArr[i] = kb.nextInt();
		
		for(int x : T.solution(n, nArr, m, mArr)) System.out.print(x + " ");
	}
}
