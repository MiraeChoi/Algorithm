package i_greedy_algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Body01T implements Comparable<Body01T> {
	public int h, w;
	
	public Body01T(int h, int w) {
		this.h = h;
		this.w = w;
	}

	@Override
	public int compareTo(Body01T o) {
		return o.h - this.h;
	}
}

class Ex09_01_T {
	public int solution(ArrayList<Body01T> arr, int n) {
		int cnt = 0;
		Collections.sort(arr);
		int max = Integer.MIN_VALUE;
		
		for(Body01T ob : arr) {
			if(ob.w > max) {
				max = ob.w;
				cnt++;
			}
		}
		return cnt;
	}
	
	public static void main(String[] args) {
		Ex09_01_T T = new Ex09_01_T();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArrayList<Body01T> arr = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			int h = kb.nextInt();
			int w = kb.nextInt();
			arr.add(new Body01T(h, w));
		}
		System.out.println(T.solution(arr, n));
	}
}
