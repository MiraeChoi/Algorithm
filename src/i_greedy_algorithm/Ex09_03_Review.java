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
	//설명
	//현수는 다음 달에 결혼을 합니다.
	//현수는 결혼식 피로연을 장소를 빌려 3일간 쉬지 않고 하려고 합니다.
	//피로연에 참석하는 친구들 N명의 참석하는 시간정보를 현수는 친구들에게 미리 요구했습니다.
	//각 친구들은 자신이 몇 시에 도착해서 몇 시에 떠날 것인지 현수에게 알려주었습니다.
	//현수는 이 정보를 바탕으로 피로연 장소에 동시에 존재하는 최대 인원수를 구하여 그 인원을 수용할 수 있는 장소를 빌리려고 합니다. 여러분이 현수를 도와주세요.
	//만약 한 친구가 오는 시간 13, 가는 시간 15라면 이 친구는 13시 정각에 피로연 장에 존재하는 것이고 15시 정각에는 존재하지 않는다고 가정합니다.
	
	//입력
	//첫째 줄에 피로연에 참석할 인원수 N(5<=N<=100,000)이 주어집니다.
	//두 번째 줄부터 N줄에 걸쳐 각 인원의 오는 시간과 가는 시간이 주어집니다.
	//시간은 첫날 0시를 0으로 해서 마지막날 밤 12시를 72로 하는 타임라인으로 오는 시간과 가는 시간이 음이 아닌 정수로 표현됩니다.
	
	//출력
	//첫째 줄에 피로연장에 동시에 존재하는 최대 인원을 출력하세요.
	public int solution(ArrayList<Sort03R> arr) {
		int answer = 0;
		Collections.sort(arr);
		for(int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i).s + "/" + arr.get(i).t);
		}
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
