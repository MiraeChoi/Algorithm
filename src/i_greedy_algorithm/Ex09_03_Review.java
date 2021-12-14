package i_greedy_algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Sort03R implements Comparable<Sort03R>{
	int t; char s;
	
	public Sort03R(int t, char s) {
		this.t = t;
		this.s = s;
	}
	
	@Override
	public int compareTo(Sort03R o) {
		if(this.t == o.t) return this.s - o.s;
		else return this.t - o.t;
	}
}

class Ex09_03_Review {
	public int solution(ArrayList<Sort03R> arr) {
		int answer = 0;
		Collections.sort(arr);
		int cnt = 0;
		
		for(Sort03R ob : arr) {
			if(ob.s == 's') cnt++;
			else cnt--;
			answer = Math.max(answer, cnt);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Ex09_03_Review T = new Ex09_03_Review();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArrayList<Sort03R> arr = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			arr.add(new Sort03R(kb.nextInt(), 's'));
			arr.add(new Sort03R(kb.nextInt(), 'e'));
		}
		System.out.println(T.solution(arr));
	}
}
