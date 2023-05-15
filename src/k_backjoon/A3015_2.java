package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class A3015_2 {
	//맞았습니다!!
	private static class Pair3015_2 {
		int height;
		int cnt;
		
		public Pair3015_2(int height, int cnt) {
			this.height = height;
			this.cnt = cnt;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Stack<Pair3015_2> stack = new Stack<>();
		long answer = 0;
		for(int i = 0; i < N; i++) {
			int cur = Integer.parseInt(br.readLine());
			Pair3015_2 pair = new Pair3015_2(cur, 1);
			while(!stack.empty() && stack.peek().height <= cur) {
				Pair3015_2 pop = stack.pop();
				answer += pop.cnt;
				if(pop.height == cur) pair.cnt += pop.cnt;
			}
			if(!stack.empty()) answer++;
			stack.push(pair);
			System.out.println("answer : " + answer);
		}
		System.out.print(answer);
	}
}