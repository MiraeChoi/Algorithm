package i_greedy_algorithm;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

class Edge08R implements Comparable<Edge08R>{
	int vex, cost;
	
	public Edge08R(int vex, int cost) {
		this.vex = vex;
		this.cost = cost;
	}

	@Override
	public int compareTo(Edge08R o) {
		return this.cost - o.cost;
	}
}

class Ex09_08_Review {
	//설명
	//원더랜드에 문제가 생겼다. 원더랜드의 각 도로를 유지보수하는 재정이 바닥난 것이다.
	//원더랜드는 모든 도시를 서로 연결하면서 최소의 유지비용이 들도록 도로를 선택하고 나머지 도로는 폐쇄하려고 한다.
	//아래의 그림은 그 한 예를 설명하는 그림이다.
	//(그림 1)
	//위의 지도는 각 도시가 1부터 9로 표현되었고, 지도의 오른쪽은 최소비용 196으로 모든 도시를 연결하는 방법을 찾아낸 것이다.
	
	//입력
	//첫째 줄에 도시의 개수 V(1≤V≤100)와 도로의 개수 E(1≤E≤1,000)가 주어진다.
	//다음 E개의 줄에는 각 도로에 대한 정보를 나타내는 세 정수 A, B, C가 주어진다.
	//이는 A번 도시와 B번 도시가 유지비용이 C인 도로로 연결되어 있다는 의미이다.
	
	//출력
	//모든 도시를 연결하면서 드는 최소비용을 출력한다.
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int v = kb.nextInt();
		int e = kb.nextInt();
		int[] ch = new int[v+1];
		ArrayList<ArrayList<Edge08R>> arr = new ArrayList<>();
		for(int i = 0; i <= v; i++) arr.add(new ArrayList<>());
		for(int i = 0; i < e; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			int c = kb.nextInt();
			arr.get(a).add(new Edge08R(b, c));
			arr.get(b).add(new Edge08R(a, c));
		}
		int answer = 0;
		PriorityQueue<Edge08R> pQ = new PriorityQueue<>();
		pQ.offer(new Edge08R(1, 0));
		while(!pQ.isEmpty()) {
			Edge08R tmp = pQ.poll();
			int ev = tmp.vex;
			if(ch[ev] == 0) {
				ch[ev] = 1;
				answer += tmp.cost;
				for(Edge08R ob : arr.get(ev)) {
					if(ch[ob.vex] == 0) pQ.offer(new Edge08R(ob.vex, ob.cost));
				}
			}
		}
		System.out.println(answer);
	}
}
