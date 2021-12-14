package i_greedy_algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

class Sort04M implements Comparable<Sort04M> {
	int m, d;
	
	public Sort04M(int m, int d) {
		this.m = m;
		this.d = d;
	}

	@Override
	public int compareTo(Sort04M o) {
		return o.d - this.d;
	}
}

class Ex09_04_M {
	public int solution(int n, ArrayList<Sort04M> arr) {
		int answer = 0;
		Collections.sort(arr);
		PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
		int max = arr.get(0).d;
		
		for(int i = 0; i < n; i++) {
			System.out.println(arr.get(i).m + "/" + arr.get(i).d);
		}
		
		for(int i = 0; i < n; i++) {
			pQ.offer(arr.get(i).m);
			System.out.println("pQ : " + pQ);
			int cnt = arr.get(i).d;
			
			if(i == n-1 || arr.get(i+1).d != cnt) {
				if(i != n-1) cnt = arr.get(i+1).d;
				answer += pQ.poll();
				System.out.println("answer : " + answer);
			}
			
			
			System.out.println("cnt : " + cnt);
			System.out.println("-------------------------");
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Ex09_04_M T = new Ex09_04_M();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArrayList<Sort04M> arr = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			int m = kb.nextInt();
			int d = kb.nextInt();
			arr.add(new Sort04M(m, d));
		}
		System.out.println(T.solution(n, arr));
	}
}
