package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

class A10866 {
	//맞았습니다!!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		LinkedList<Integer> Deque = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		while(N-- > 0) {
			String str = br.readLine();
			int num;
			if(str.startsWith("push_front")) {
				num = Integer.parseInt(str.substring(11, str.length()));
				Deque.offerFirst(num);
			} else if(str.startsWith("push_back")) {
				num = Integer.parseInt(str.substring(10, str.length()));
				Deque.offerLast(num);
			} else if(str.startsWith("pop_front")) {
				sb.append(Deque.size() == 0 ? -1 : Deque.pollFirst()).append('\n');
			} else if(str.startsWith("pop_back")) {
				sb.append(Deque.size() == 0 ? -1 : Deque.pollLast()).append('\n');
			} else {
				int size = Deque.size();
				switch(str) {
				case "size" :
					sb.append(size).append('\n');
					break;
				case "empty" :
					sb.append(size == 0 ? 1 : 0).append('\n');
					break;
				case "front" : 
					sb.append(size == 0 ? -1 : Deque.getFirst()).append('\n');
					break;
				case "back" : 
					sb.append(size == 0 ? -1 : Deque.getLast()).append('\n');
					break;
				}
			}
		}
		System.out.println(sb);
	}
}