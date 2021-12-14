package i_greedy_algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Point01R implements Comparable<Point01R> {
	int h, w;
	
	public Point01R(int h, int w) {
		this.h = h;
		this.w = w;
	}

	@Override
	public int compareTo(Point01R o) {
		return o.h - this.h;
	}
}

class Ex09_01_Review {
	public int solution(int n, ArrayList<Point01R> arr) {
		int answer = 0;
		Collections.sort(arr);
		int max = Integer.MIN_VALUE;
		
		for(Point01R body : arr) {
			if(body.w > max) {
				max = body.w;
				answer++;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Ex09_01_Review T = new Ex09_01_Review();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArrayList<Point01R> arr = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			arr.add(new Point01R(kb.nextInt(), kb.nextInt()));
		}
		System.out.println(T.solution(n, arr));
	}
}
