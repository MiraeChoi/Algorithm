package i_greedy_algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

class Lecture04T implements Comparable<Lecture04T> {
	public int money, time;
	
	public Lecture04T(int money, int time) {
		this.money = money;
		this.time = time;
	}

	@Override
	public int compareTo(Lecture04T o) {
		return o.time - this.time;
	}
}

class Ex09_04_T {
	static int n, max = Integer.MIN_VALUE;
	
	public int solution(ArrayList<Lecture04T> arr) {
		int answer = 0;
		PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
		Collections.sort(arr);
		int j = 0;
		
		for(int i = 0; i < n; i++) {
			System.out.println("haha : " + arr.get(i).money + "/" + arr.get(i).time);
		}
		
		for(int i = max; i >= 1; i--) {
			System.out.println("i : " + i);
			for(; j < n; j++) {
				System.out.println("j : " + j);
				if(arr.get(j).time < i) break;
				pQ.offer(arr.get(j).money);
				System.out.println("pQ Ãß°¡¿° : " + arr.get(j).money);
			}
			if(!pQ.isEmpty()) {
				System.out.println("i/j : " + i + "/" + j);
				answer += pQ.poll();
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Ex09_04_T T = new Ex09_04_T();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		ArrayList<Lecture04T> arr = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			int m = kb.nextInt();
			int t = kb.nextInt();
			arr.add(new Lecture04T(m, t));
			if(t > max) max = t;
		}
		System.out.println(T.solution(arr));
	}
}
