package b_array;

import java.util.ArrayList;
import java.util.Scanner;

class Ex02_06 {
	//설명
	//N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.
	//예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.
	//첫 자리부터의 연속된 0은 무시한다.
	
	//입력
	//첫 줄에 자연수의 개수 N(3<=N<=100)이 주어지고, 그 다음 줄에 N개의 자연수가 주어진다.
	//각 자연수의 크기는 100,000를 넘지 않는다.
	
	//출력
	//첫 줄에 뒤집은 소수를 출력합니다. 출력순서는 입력된 순서대로 출력합니다.
	public ArrayList<Integer> solution(int n, String[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		int[] pArr = new int[n];
		
		for(int i = 0; i < arr.length; i++) {
			String tmp = "";
			
			for(int j = arr[i].length()-1; j >= 0; j--) tmp += arr[i].charAt(j);
			
			pArr[i] = Integer.parseInt(tmp);
		}
		
		for(int i = 0; i < pArr.length; i++) {
			int count = 0;
			
			if(pArr[i] >= 2) {
				for(int j = 2; j < pArr[i]; j++) {
					if(pArr[i] % j == 0) {
						count++;
						break;
					}
				}
			} else count++;
			
			if(count == 0) answer.add(pArr[i]);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex02_06 T = new Ex02_06();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String[] arr = new String[n];
		
		for(int i = 0; i < arr.length; i++) arr[i] = kb.next();
		for(int x : T.solution(n, arr)) System.out.print(x + " ");
	}
}
