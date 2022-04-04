package b_array;

import java.util.Scanner;

class Ex02_03 {
	//설명
	//A, B 두 사람이 가위바위보 게임을 합니다. 총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.
	//가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.
	//예를 들어 N=5이면
	//(그림 1)
	//두 사람의 각 회의 가위, 바위, 보 정보가 주어지면 각 회를 누가 이겼는지 출력하는 프로그램을 작성하세요.
	
	//입력
	//첫 번째 줄에 게임 횟수인 자연수 N(1<=N<=100)이 주어집니다.
	//두 번째 줄에는 A가 낸 가위, 바위, 보 정보가 N개 주어집니다.
	//세 번째 줄에는 B가 낸 가위, 바위, 보 정보가 N개 주어집니다.
	
	//출력
	//각 줄에 각 회의 승자를 출력합니다. 비겼을 경우는 D를 출력합니다.
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
