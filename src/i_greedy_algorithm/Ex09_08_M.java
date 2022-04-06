package i_greedy_algorithm;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

class Edge08M implements Comparable<Edge08M>{
	int vex, cost;
	
	public Edge08M(int vex, int cost) {
		this.vex = vex;
		this.cost = cost;
	}

	@Override
	public int compareTo(Edge08M o) {
		return this.cost - o.cost;
	}
}

class Ex09_08_M {
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
	static int v, e, answer = 0;
	static int[] ch;
	static ArrayList<ArrayList<Edge08M>> arr;
	
	public void solution(int v) {
		PriorityQueue<Edge08M> pQ = new PriorityQueue<>();
		pQ.offer(new Edge08M(v, 0));
		
		while(!pQ.isEmpty()) {
			Edge08M tmp = pQ.poll();
			int nv = tmp.vex;
			int nc = tmp.cost;
			
			if(ch[nv] == 0) {
				ch[nv] = 1;
				answer += nc;
				
				for(int i = 1; i < arr.size(); i++) {
					for(int j = 0; j < arr.get(i).size(); j++) {
						if(arr.get(i).get(j).vex == nv && ch[i] == 0) {
							pQ.offer(new Edge08M(i, arr.get(i).get(j).cost));
						}
					}
				}
				for(Edge08M ob : arr.get(nv)) {
					if(ch[ob.vex] == 0) {
						pQ.offer(new Edge08M(ob.vex, ob.cost));
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Ex09_08_M T = new Ex09_08_M();
		Scanner kb = new Scanner(System.in);
		v = kb.nextInt();
		e = kb.nextInt();
		ch = new int[v+1];
		arr = new ArrayList<>();
		for(int i = 0; i <= e; i++) arr.add(new ArrayList<>());
		for(int i = 0; i < e; i++) {
			int v1 = kb.nextInt();
			int v2 = kb.nextInt();
			int cost = kb.nextInt();
			arr.get(v1).add(new Edge08M(v2, cost));
		}
		T.solution(1);
		System.out.println(answer);
	}
}
