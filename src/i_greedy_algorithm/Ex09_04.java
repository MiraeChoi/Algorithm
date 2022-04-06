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
	//설명
	//현수는 유명한 강연자이다. N개이 기업에서 강연 요청을 해 왔다. 각 기업은 D일 안에 와서 강연을 해 주면 M만큼의 강연료를 주기로 했다.
	//각 기업이 요청한 D와 M를 바탕으로 가장 많을 돈을 벌 수 있도록 강연 스케줄을 짜야 한다.
	//단 강연의 특성상 현수는 하루에 하나의 기업에서만 강연을 할 수 있다.
	
	//입력
	//첫 번째 줄에 자연수 N(1<=N<=10,000)이 주어지고, 다음 N개의 줄에 M(1<=M<=10,000)과 D(1<=D<=10,000)가 차례로 주어진다.
	
	//출력
	//첫 번째 줄에 최대로 벌 수 있는 수입을 출력한다.
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
