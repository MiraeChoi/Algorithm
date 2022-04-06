package j_dynamic_programming;

import java.util.Scanner;

class Ex10_06_Review {
	//설명
	//이번 정보올림피아드대회에서 좋은 성적을 내기 위하여 현수는 선생님이 주신 N개의 문제를 풀려고 합니다.
	//각 문제는 그것을 풀었을 때 얻는 점수와 푸는데 걸리는 시간이 주어지게 됩니다.
	//제한 시간 M안에 N개의 문제 중 최대 점수를 얻을 수 있도록 해야 합니다.
	//(해당 문제는 해당 시간이 걸리면 푸는 걸로 간주한다, 한 유형당 한 개만 풀 수 있습니다.)
	
	//입력
	//첫 번째 줄에 문제의 개수 N(1<=N<=50)과 제한 시간 M(10<=M<=300)이 주어집니다.
	//두 번째 줄부터 N줄에 걸쳐 문제를 풀었을 때의 점수와 푸는 데 걸리는 시간이 주어집니다.
	
	//출력
	//첫 번째 줄에 제한 시간안에 얻을 수 있는 최대 점수를 출력합니다.
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] dy = new int[m+1];
		for(int i = 0; i < n; i++) {					//i = 0									i = 1
			int ps = kb.nextInt();						//ps = 10								ps = 25
			int pt = kb.nextInt();						//pt = 5								pt = 12
			System.out.print("dy[" + i + "]");
			for(int j = m; j >= pt; j--) {				//j = 20, j >= 5						j = 20, j >= 12
				dy[j] = Math.max(dy[j], dy[j-pt] + ps); //dy[20] = dy[20-5] + 10 = 0 + 10 = 10	dy[20] = dy[20-12] + 25 = 10 + 25 = 35
				//System.out.print(dy[j] + " ");
			}											//dy[19] = 0 + 10 = 10  ...dy[5] = 10	dy[19] = 35 ... dy[16] = 0 + 25 = 25
			//System.out.println();
		}
		System.out.println(dy[m]);
	}
}
