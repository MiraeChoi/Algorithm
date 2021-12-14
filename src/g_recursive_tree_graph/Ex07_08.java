package g_recursive_tree_graph;

import java.util.Scanner;

class Ex07_08 {
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
