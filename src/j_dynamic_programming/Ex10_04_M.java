package j_dynamic_programming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Brick04M implements Comparable<Brick04M>{
	int s, h, w;
	
	public Brick04M(int s, int h, int w) {
		this.s = s;
		this.h = h;
		this.w = w;
	}

	@Override
	public int compareTo(Brick04M o) {
		return o.s - this.s;
	}
}

class Ex10_04_M {
	static int[] dy;
	
	public int solution(int n, ArrayList<Brick04M> arr) {
		int answer = 0;
		
		for(int i = 0; i < n; i++) {
			int max = 0;
			
			for(int j = i-1; j >= 0; j--) {
				if(arr.get(i).w < arr.get(j).w && dy[j] > max) max = dy[j];
			}
			dy[i] = arr.get(i).h + max;
			answer = Math.max(answer, dy[i]);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Ex10_04_M T = new Ex10_04_M();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		dy = new int[n];
		ArrayList<Brick04M> arr = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			arr.add(new Brick04M(kb.nextInt(), kb.nextInt(), kb.nextInt()));
		}
		Collections.sort(arr);
		System.out.println(T.solution(n, arr));
	}
}
