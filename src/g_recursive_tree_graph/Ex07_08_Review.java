package g_recursive_tree_graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Ex07_08_Review {
	public int solution(int s, int e) {
		int L = 0;
		int[] dis = {1, -1, 5};
		int[] ch = new int[10001];
		Queue<Integer> Q = new LinkedList<>();
		Q.offer(s);
		ch[s] = 1;
		
		while(!Q.isEmpty()) {
			int len = Q.size();
			
			for(int i = 0; i < len; i++) {
				int x = Q.poll();
				
				for(int j = 0; j < dis.length; j++) {
					int nx = x + dis[j];
					if(nx == e) return L+1;
					if(nx > 0 && nx < 10000 && ch[nx] == 0) {
						Q.offer(nx);
						ch[nx] = 1;
					}
				}
			}
			L++;
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
