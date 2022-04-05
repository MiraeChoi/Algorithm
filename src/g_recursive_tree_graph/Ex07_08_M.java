package g_recursive_tree_graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Calf {
	int data;
	Calf p5, p1, m1;
	
	public Calf(int n) {
		data = n;
		p5 = p1 = m1 = null;
	}
}

class Ex07_08_M {
	//설명
	//현수는 송아지를 잃어버렸다. 다행히 송아지에는 위치추적기가 달려 있다.
	//현수의 위치와 송아지의 위치가 수직선상의 좌표 점으로 주어지면 현수는 현재 위치에서 송아지의 위치까지 다음과 같은 방법으로 이동한다.
	//송아지는 움직이지 않고 제자리에 있다.
	//현수는 스카이 콩콩을 타고 가는데 한 번의 점프로 앞으로 1, 뒤로 1, 앞으로 5를 이동할 수 있다.
	//최소 몇 번의 점프로 현수가 송아지의 위치까지 갈 수 있는지 구하는 프로그램을 작성하세요.

	//입력
	//첫 번째 줄에 현수의 위치 S와 송아지의 위치 E가 주어진다. 직선의 좌표 점은 1부터 10,000까지이다.

	//출력
	//점프의 최소횟수를 구한다. 답은 1이상이며 반드시 존재합니다.
	static Calf calf1;
	static int E;
	static int L = 0;
	static Queue<Integer> Q = new LinkedList<>();
	
	public void BFS(Calf calf) {
		if(calf == null) return;
		if(calf.data == E) {
			System.out.println(L);
			return;
		}
		Q.offer(calf.data);
		
		int len = Q.size();
		
		for(int i = 0; i < len; i++) {
			int cur = Q.poll();
			
			int p1 = cur + 1;
			int m1 = cur - 1;
			int p5 = cur + 5;
			
			if(p1 == E || m1 == E || p5 == E) {
				System.out.println(++L);
				return;
			}
			
			if(!Q.contains(p1)) {
				Q.offer(p1);
				calf.p1 = new Calf(p1);
			}
			if(!Q.contains(m1)) {
				Q.offer(m1);
				calf.m1 = new Calf(m1);
			}
			if(!Q.contains(p5)) {
				Q.offer(p5);
				calf.p5 = new Calf(p5);
			}
		}
		L++;
		
		if(calf.p1 != null) BFS(calf.p1);
		if(calf.m1 != null) BFS(calf.m1);
		if(calf.p5 != null) BFS(calf.p5);
	}
	
	public static void main(String[] args) {
		Ex07_08_M T = new Ex07_08_M();
		Scanner kb = new Scanner(System.in);
		int S = kb.nextInt();
		E = kb.nextInt();
		T.BFS(calf1 = new Calf(S));
	}
}
