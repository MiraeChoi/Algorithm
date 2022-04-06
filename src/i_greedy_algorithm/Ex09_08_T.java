package i_greedy_algorithm;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

class Edge08T implements Comparable<Edge08T>{
	int vex, cost;
	
	public Edge08T(int vex, int cost) {
		this.vex = vex;
		this.cost = cost;
	}

	@Override
	public int compareTo(Edge08T o) {
		return this.cost - o.cost;
	}
}

class Ex09_08_T {
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
		int n = kb.nextInt();
		int m = kb.nextInt();
		ArrayList<ArrayList<Edge08T>> graph = new ArrayList<>();
		for(int i = 0; i <= n; i++) graph.add(new ArrayList<>());
		int[] ch = new int[n+1];
		for(int i = 0; i < m; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			int c = kb.nextInt();
			graph.get(a).add(new Edge08T(b, c));
			graph.get(b).add(new Edge08T(a, c));
		}
		int answer = 0;
		PriorityQueue<Edge08T> pQ = new PriorityQueue<>();
		pQ.offer(new Edge08T(1, 0));
		while(!pQ.isEmpty()) {
			Edge08T tmp = pQ.poll();
			int ev = tmp.vex;
			if(ch[ev] == 0) {
				ch[ev] = 1;
				answer += tmp.cost;
				
				for(Edge08T ob : graph.get(ev)) {
					if(ch[ob.vex] == 0) pQ.offer(new Edge08T(ob.vex, ob.cost));
				}
			}
		}
		System.out.println(answer);
	}
}
