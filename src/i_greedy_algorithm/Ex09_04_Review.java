package i_greedy_algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

class Lecture04R implements Comparable<Lecture04R>{
	int money, day;
	
	public Lecture04R(int money, int day) {
		this.money = money;
		this.day = day;
	}

	@Override
	public int compareTo(Lecture04R o) {
		return o.day - this.day;
	}
}

class Ex09_04_Review {
	static int n, max = Integer.MIN_VALUE;
	
	public int solution(ArrayList<Lecture04R> arr) {
		int answer = 0;
		Collections.sort(arr);
		PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
		int j = 0;
		
		for(int i = max; i >= 1; i--) {
			for(; j < n; j++) {
				if(arr.get(j).day < i) break;
				pQ.offer(arr.get(j).money);
			}
			if(!pQ.isEmpty()) answer += pQ.poll();
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Ex09_04_Review T = new Ex09_04_Review();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		ArrayList<Lecture04R> arr = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			int m = kb.nextInt();
			int d = kb.nextInt();
			arr.add(new Lecture04R(m, d));
			if(d > max) max = d;
		}
		System.out.println(T.solution(arr));
	}
}
