package c_pointers_n_window;

import java.util.ArrayList;
import java.util.Scanner;

class Ex03_01 {
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
