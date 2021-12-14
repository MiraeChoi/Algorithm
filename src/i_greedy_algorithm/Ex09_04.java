package i_greedy_algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Schedule04 implements Comparable<Schedule04>{
	int m, d;
	
	public Schedule04(int m, int d) {
		this.m = m;
		this.d = d;
	}

	@Override
	public int compareTo(Schedule04 o) {
		if(this.d == o.d) return o.m - this.m;
		else return this.d - o.d;
	}
}

class Ex09_04 {
	public int solution(int n, ArrayList<Schedule04> arr) {
		int answer = 0;
		Collections.sort(arr);
		int cnt = 0;
		
		for(int i = 0; i < n; i++) {
			System.out.println("(" + arr.get(i).m + ", " + arr.get(i).d + ")");
		}
		
		for(int i = 0; i < n; i++) {
			if(arr.get(i).d != cnt) {
				cnt = arr.get(i).d;
				answer += arr.get(i).m;
				System.out.println("answer : " + answer);
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Ex09_04 T = new Ex09_04();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArrayList<Schedule04> arr = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			arr.add(new Schedule04(kb.nextInt(), kb.nextInt()));
		}
		System.out.println(T.solution(n, arr));
	}
}
