package j_dynamic_programming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class QnT06 implements Comparable<QnT06>{
	int score, time;
	
	public QnT06(int score, int time) {
		this.score = score;
		this.time = time;
	}

	@Override
	public int compareTo(QnT06 o) {
		return this.time - o.time;
	}
}

class Ex10_06 {
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
	static int[] dy;
	
	public int solution(int n, int m, ArrayList<QnT06> arr) {
		Collections.sort(arr);
		
		for(int i = 0; i < n; i++) {
			int time = arr.get(i).time;
			
			for(int j = time; j <= m; j++) {
				System.out.println(j + "/" + (j - time));
				dy[j] = Math.max(dy[j], dy[j - time] + arr.get(i).score);
			}
			System.out.println();
			System.out.print("dy : ");
			for(int x : dy) {
				System.out.print(x + " ");
			}
			System.out.println();
			System.out.println("----------------------------");
		}
		return dy[m];
	}
	
	public static void main(String[] args) {
		Ex10_06 T = new Ex10_06();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		ArrayList<QnT06> arr = new ArrayList<QnT06>();
		for(int i = 0; i < n; i++) {
			arr.add(new QnT06(kb.nextInt(), kb.nextInt()));
		}
		dy = new int[m+1];
		System.out.println(T.solution(n, m, arr));
	}
}
