package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class A1021_1 {
	//Æ²·È½À´Ï´Ù
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		Queue<Integer> Q = new LinkedList<>();
		for(int i = 0; i < N; i++) Q.offer(i + 1);
		st = new StringTokenizer(br.readLine());
		int answer = 0;
		for(int i = 0; i < M; i++) {
			int cur = Integer.parseInt(st.nextToken());
			while(Q.peek() != cur) {
				int size = Q.size() - 1;
				answer++;
				if(Math.abs((N - 1) - (cur - 1)) < Math.abs(cur - 1)) {
					//left
					while(size-- > 0) {
						Q.offer(Q.poll());
					}
					System.out.println("left : " + Q);
				} else {
					//right
					Q.offer(Q.poll());
					System.out.println("right : " + Q);
				}
			}
			if(Q.peek() == cur) Q.poll();
		}
		System.out.println(answer);
	}
}