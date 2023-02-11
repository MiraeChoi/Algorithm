package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class A1966_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		while(T-- > 0) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken()); //문서의 개수
			int M = Integer.parseInt(st.nextToken()); //몇 번째로 인쇄되는지
			st = new StringTokenizer(br.readLine());
			Queue<int[]> Q = new LinkedList<>();
			
			for(int i = 0; i < N; i++) Q.offer(new int[] {i, Integer.parseInt(st.nextToken())});
			sb.append("T : ").append(T).append('\n');
			if(N == 1) sb.append(1).append('\n');
			else {
//				int cur = Q.poll();
//				int rank = 0;
//				boolean check = false;
//				for(int i = cur + 1; i < N; i++) {
//					rank++;
//					if(Q.contains(i)) {
//						check = Q.offer(cur);
//						System.out.println("Q : " + Q);
//					}
//					if(rank == M) {
//						sb.append(rank).append('\n');
//						continue;
//					}
//				}
//				if(!check) sb.append(rank).append('\n');
			}
		}
		System.out.println(sb);
	}
}
