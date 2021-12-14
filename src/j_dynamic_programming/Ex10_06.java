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
