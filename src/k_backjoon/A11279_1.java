package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

class A11279_1 {
	//맞았습니다!!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> Q = new PriorityQueue<>(Collections.reverseOrder());
		StringBuilder sb = new StringBuilder();
		while(N-- > 0) {
			int num = Integer.parseInt(br.readLine());
			if(num == 0) {
				if(Q.size() == 0) sb.append(0).append('\n');
				else sb.append(Q.poll()).append('\n');
			} else {
				Q.add(num);
			}
		}
		System.out.println(sb);
	}
}