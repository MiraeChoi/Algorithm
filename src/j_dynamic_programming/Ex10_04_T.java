package j_dynamic_programming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Brick04T implements Comparable<Brick04T> {
	int s, h, w;
	
	public Brick04T(int s, int h, int w) {
		this.s = s;
		this.h = h;
		this.w = w;
	}

	@Override
	public int compareTo(Brick04T o) {
		return o.s - this.s;
	}
}

class Ex10_04_T {
	static int[] dy;
	
	public int solution(ArrayList<Brick04T> arr) {
		int answer = 0;
		Collections.sort(arr);
		dy[0] = arr.get(0).h;
		answer = dy[0];
		
		for(int i = 1; i < arr.size(); i++) {
			int max_h = 0;
			
			for(int j = i-1; j >= 0; j--) {
				if(arr.get(j).w > arr.get(i).w && dy[j] > max_h) {
					max_h = dy[j]; 
				}
			}
			dy[i] = arr.get(i).h + max_h;
			answer = Math.max(answer, dy[i]);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Ex10_04_T T = new Ex10_04_T();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArrayList<Brick04T> arr = new ArrayList<>();
		dy = new int[n];
		for(int i = 0; i < n; i++) arr.add(new Brick04T(kb.nextInt(), kb.nextInt(), kb.nextInt()));
		System.out.println(T.solution(arr));
	}
}
