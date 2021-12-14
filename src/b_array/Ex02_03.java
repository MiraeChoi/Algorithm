package b_array;

import java.util.Scanner;

class Ex02_03 {
	public String[] solution(int n, int[] aArr, int[] bArr) {
		String[] answer = new String[n];
		
		for(int i = 0; i < n; i++) {
			if(aArr[i] == bArr[i]) {
				answer[i] = "D";
			} else {
				if((aArr[i] == 3 && bArr[i] == 1) || (aArr[i] == 1 && bArr[i] == 3)) {
					if(aArr[i] > bArr[i]) answer[i] = "B";
					else answer[i] = "A";
				} else {
					if(aArr[i] > bArr[i]) answer[i] = "A";
					else answer[i] = "B";
				}
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex02_03 T = new Ex02_03();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] aArr = new int[n];
		int[] bArr = new int[n];
		
		for(int i = 0; i < n; i++) {
			aArr[i] = kb.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			bArr[i] = kb.nextInt();
		}
		
		for(String x : T.solution(n, aArr, bArr)) {
			System.out.println(x);
		}
	}
}
