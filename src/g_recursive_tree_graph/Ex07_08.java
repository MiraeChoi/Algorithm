package g_recursive_tree_graph;

import java.util.Scanner;

class Ex07_08 {
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
	public int solution(int S, int E) {
		int answer = 0;
		int cur = S;
		int j5 = 5, j1 = 1, j_1 = -1;
		
		while(E-cur > 3) {
			cur += j5;
			System.out.println("cur : " + cur);
			answer++;
		}
		
		if(E > cur) {
			while(cur != E) {
				cur += j1;
				answer++;
			}
		} else {
			while(cur != E) {
				cur += j_1;
				answer++;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Ex07_08 T = new Ex07_08();
		Scanner kb = new Scanner(System.in);
		int S = kb.nextInt();
		int E = kb.nextInt();
		System.out.println(T.solution(S, E));
	}
}
