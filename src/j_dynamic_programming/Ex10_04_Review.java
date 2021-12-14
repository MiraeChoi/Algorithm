package j_dynamic_programming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Brick04R implements Comparable<Brick04R>{
	int s, h, w;
	
	public Brick04R(int s, int h, int w) {
		this.s = s;
		this.h = h;
		this.w = w;
	}

	@Override
	public int compareTo(Brick04R o) {
		return o.s - this.s;
	}
}

class Ex10_04_Review {
	static int[] dy;
	
	public int solution(int n, ArrayList<Brick04R> arr) {
		Collections.sort(arr);
		int answer = dy[0] = arr.get(0).h;
		
		for(int i = 1; i < n; i++) {
			int max = 0;
			
			for(int j = i-1; j >= 0; j--) {
				if(arr.get(j).w > arr.get(i).w && dy[j] > max) max = dy[j];
			}
			dy[i] = arr.get(i).h + max;
			answer = Math.max(answer, dy[i]);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Ex10_04_Review T = new Ex10_04_Review();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArrayList<Brick04R> arr = new ArrayList<>();
		dy = new int[n];
		for(int i = 0; i < n; i++) {
			arr.add(new Brick04R(kb.nextInt(), kb.nextInt(), kb.nextInt()));
		}
		System.out.println(T.solution(n, arr));
	}
}
