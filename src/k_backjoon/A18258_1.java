package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class A18258_1 {
	//맞았습니다!!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Queue<Integer> Q = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		int last = 0;
		while(N-- > 0) {
			String str = br.readLine();
			if(str.startsWith("push")) {
				int num = Integer.parseInt(str.substring(5, str.length()));
				last = num;
				Q.offer(num);
			} else {
				switch(str) {
				case "pop" : 
					if(Q.isEmpty()) sb.append(-1).append('\n');
					else sb.append(Q.poll()).append('\n');
					break;
				case "size" :
					sb.append(Q.size()).append('\n');
					break;
				case "empty" :
					if(Q.isEmpty()) sb.append(1).append('\n');
					else sb.append(0).append('\n');
					break;
				case "front" : 
					if(Q.isEmpty()) sb.append(-1).append('\n');
					else sb.append(Q.peek()).append('\n');
					break;
				case "back" : 
					if(Q.isEmpty()) sb.append(-1).append('\n');
					else sb.append(last).append('\n');
					break;
				}
			}
		}
		System.out.println(sb);
	}
}