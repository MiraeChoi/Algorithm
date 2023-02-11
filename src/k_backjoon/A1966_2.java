package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

class A1966_2 {
	//맞았습니다!!
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
			LinkedList<int[]> Q = new LinkedList<>();
			for(int i = 0; i < N; i++) Q.offer(new int[] {i, Integer.parseInt(st.nextToken())});
			int cnt = 0;
			while(!Q.isEmpty()) {
				int[] first = Q.poll();
				boolean isMax = true;
				for(int i = 0; i < Q.size(); i++) {
					if(Q.get(i)[1] > first[1]) {
						Q.offer(first);
						for(int j = 0; j < i; j++) Q.offer(Q.poll());
						isMax = false;
						break;
					}
				}
				if(!isMax) continue;
				cnt++;
				if(first[0] == M) break;
			}
			sb.append(cnt).append('\n');
		}
		System.out.println(sb);
	}
}