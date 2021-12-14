package i_greedy_algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Sort02R implements Comparable<Sort02R>{
	int s, e;
	
	public Sort02R(int s, int e) {
		this.s = s;
		this.e = e;
	}
	
	@Override
	public int compareTo(Sort02R o) {
		if(this.e == o.e) return this.s - o.s;
		else return this.e - o.e;
	}
}

class Ex09_02_Review {
	public int solution(int n, ArrayList<Sort02R> arr) {
		int answer = 0;
		Collections.sort(arr);
		int et = 0;
		
		for(Sort02R ob : arr) {
			if(ob.s >= et) {
				answer++;
				et = ob.e;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Ex09_02_Review T = new Ex09_02_Review();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArrayList<Sort02R> arr = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			arr.add(new Sort02R(kb.nextInt(), kb.nextInt()));
		}
		System.out.println(T.solution(n, arr));
	}
}
