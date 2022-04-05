package g_recursive_tree_graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Ex07_08_Review {
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
	public int solution(int s, int e) {					//s = 5, e = 14
		int L = 0;
		int[] dis = {1, -1, 5};
		int[] ch = new int[10001];
		Queue<Integer> Q = new LinkedList<>();
		Q.offer(s);
		ch[s] = 1;
		
		while(!Q.isEmpty()) {
			int len = Q.size();							//len = 1								| len = 3
			
			for(int i = 0; i < len; i++) {
				int x = Q.poll();						//x = 5									| x = 6								x = 4						x = 10
				
				for(int j = 0; j < dis.length; j++) {
					int nx = x + dis[j];				//nx = 6	 nx = 4      nx = 10        | nx = 7, 5, 11						nx = 5, 3, 9				nx = 11, 9, 15
					if(nx == e) return L+1;
					if(nx > 0 && nx < 10000 && ch[nx] == 0) {
						Q.offer(nx);					//Q = {6}	 Q = {6, 4}  Q = {6, 4, 10} | Q = {4, 10, 7, 5, 11}             Q = {10, 7, 5, 11, 3, 9}	Q = {7, 5, 11, 3, 9, 15}
						ch[nx] = 1;						//ch[6] = 1  ch[4] = 1   ch[10] = 1     | ch[7] = 1, ch[5] = 1, ch[11] = 1  ch[3] = 1, ch[9] = 1		ch[15] = 1
					}
				}
			}
			L++;										//L = 1									|																L = 2
		}
		return L;
	}
	
	public static void main(String[] args) {
		Ex07_08_Review T = new Ex07_08_Review();
		Scanner kb = new Scanner(System.in);
		int s = kb.nextInt();
		int e = kb.nextInt();
		System.out.println(T.solution(s, e));
	}
}
