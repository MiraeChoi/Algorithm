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
	//설명
	//현수는 유명한 강연자이다. N개이 기업에서 강연 요청을 해 왔다. 각 기업은 D일 안에 와서 강연을 해 주면 M만큼의 강연료를 주기로 했다.
	//각 기업이 요청한 D와 M를 바탕으로 가장 많을 돈을 벌 수 있도록 강연 스케줄을 짜야 한다.
	//단 강연의 특성상 현수는 하루에 하나의 기업에서만 강연을 할 수 있다.
	
	//입력
	//첫 번째 줄에 자연수 N(1<=N<=10,000)이 주어지고, 다음 N개의 줄에 M(1<=M<=10,000)과 D(1<=D<=10,000)가 차례로 주어진다.
	
	//출력
	//첫 번째 줄에 최대로 벌 수 있는 수입을 출력한다.
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
