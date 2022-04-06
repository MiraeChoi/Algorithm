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
	//설명
	//한 개의 회의실이 있는데 이를 사용하고자 하는 n개의 회의들에 대하여 회의실 사용표를 만들려고 한다.
	//각 회의에 대해 시작시간과 끝나는 시간이 주어져 있고, 각 회의가 겹치지 않게 하면서 회의실을 사용할 수 있는 최대수의 회의를 찾아라.
	//단, 회의는 한번 시작하면 중간에 중단될 수 없으며 한 회의가 끝나는 것과 동시에 다음 회의가 시작될 수 있다.
	
	//입력
	//첫째 줄에 회의의 수 n(1<=n<=100,000)이 주어진다. 둘째 줄부터 n+1 줄까지 각 회의의 정보가 주어지는데
	//이것은 공백을 사이에 두고 회의의 시작시간과 끝나는 시간이 주어진다. 회의시간은 0시부터 시작한다.
	//회의의 시작시간과 끝나는 시간의 조건은 (시작시간 <= 끝나는 시간)입니다.
	
	//출력
	//첫째 줄에 최대 사용할 수 있는 회의 수를 출력하여라.
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
