package i_greedy_algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

class Edge08 implements Comparable<Edge08>{
	public int v1, v2, cost;
	
	public Edge08(int v1, int v2, int cost) {
		this.v1 = v1;
		this.v2 = v2;
		this.cost = cost;
	}

	@Override
	public int compareTo(Edge08 o) {
		return this.cost - o.cost;
	}
}

class Ex09_08 {
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
	static int[] unf;
	static ArrayList<Edge08> arr = new ArrayList<>();
	
	public int Find(int v) {
		if(v == unf[v]) return v;
		else return unf[v] = Find(unf[v]);
	}
	
	public void solution(int v1, int v2, int cost) {
		PriorityQueue<Edge08> pQ = new PriorityQueue<>();
		pQ.offer(new Edge08(v1, v2, cost));
		for(int i = 1; i <= v; i++) unf[i] = i;
		
		while(!pQ.isEmpty()) {
			Edge08 tmp = pQ.poll();
//			int nv1 = tmp.v1;
//			int nv2 = tmp.v2;
//			int nCost = tmp.cost;
			
			for(Edge08 ob : arr) {
				if(unf[ob.v1] != unf[ob.v2]) {
					pQ.offer(new Edge08(ob.v1, ob.v2, ob.cost));
					answer += ob.cost;
					unf[ob.v1] = Find(unf[ob.v1]);
					unf[ob.v2] = Find(unf[ob.v2]);
//					unf[ob.v1] = unf[ob.v2] = v + 1;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Ex09_08 T = new Ex09_08();
		Scanner kb = new Scanner(System.in);
		v = kb.nextInt();
		e = kb.nextInt();
		unf = new int[v+1];
		for(int i = 0; i < e; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			int c = kb.nextInt();
			arr.add(new Edge08(a, b, c));
		}
		Collections.sort(arr);
		Edge08 tmp = arr.get(0);
		T.solution(tmp.v1, tmp.v2, tmp.cost);
		System.out.println(answer);
	}
}
