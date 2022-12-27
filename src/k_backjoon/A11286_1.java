package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

class A11286_1 {
	//Æ²·È½À´Ï´Ù
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pQ = new PriorityQueue<>();
		PriorityQueue<Integer> pQm = new PriorityQueue<>();
		StringBuilder sb = new StringBuilder();
		while(N-- > 0) {
			int num = Integer.parseInt(br.readLine());
			if(num > 0) pQ.add(num);
			else if(num < 0) pQm.add(num * -1);
			else {
				if(pQ.isEmpty() && pQm.isEmpty()) sb.append(0).append('\n');
				else {
					if(pQ.isEmpty()) sb.append(-pQm.poll()).append('\n');
					else if(pQm.isEmpty()) sb.append(pQ.poll()).append('\n');
					else if(pQ.peek() > pQm.peek() || pQm.peek() == pQ.peek()) sb.append(-pQm.poll()).append('\n');
					else if(pQm.peek() > pQ.peek()) sb.append(pQ.poll()).append('\n');
				}
			}
		}
		System.out.println(sb);
	}
}