package i_greedy_algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Edge07R implements Comparable<Edge07R>{
	int v1, v2, cost;
	
	public Edge07R(int v1, int v2, int cost) {
		this.v1 = v1;
		this.v2 = v2;
		this.cost = cost;
	}

	@Override
	public int compareTo(Edge07R o) {
		return this.cost - o.cost;
	}
}

class Ex09_07_Review {
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
	static int[] unf;
	
	public static int Find(int v) {
		if(v == unf[v]) return v;
		else return unf[v] = Find(unf[v]);
	}
	
	public static void Union(int a, int b) {
		int fa = Find(a);
		int fb = Find(b);
		if(fa != fb) unf[fa] = fb;
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int v = kb.nextInt();
		int e = kb.nextInt();
		unf = new int[v+1];
		for(int i = 0; i <= v; i++) unf[i] = i;
		ArrayList<Edge07R> arr = new ArrayList<>();
		for(int i = 0; i < e; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			int c = kb.nextInt();
			arr.add(new Edge07R(a, b, c));
		}
		Collections.sort(arr);
		int answer = 0;
		for(Edge07R ob : arr) {
			int fa = Find(ob.v1);
			int fb = Find(ob.v2);
			if(fa != fb) {
				Union(fa, fb);
				answer += ob.cost;
			}
		}
		System.out.println(answer);
	}
}
