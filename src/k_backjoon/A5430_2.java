package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

class A5430_2 {
	//맞았습니다!!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		wh : while(T-- > 0) {
			String fx = br.readLine();
			int n = Integer.parseInt(br.readLine());
			LinkedList<Integer> dQ = new LinkedList<>();
			StringTokenizer st = new StringTokenizer(br.readLine(), "[],");
			for(int i = 0; i < n; i++) {
				dQ.offer(Integer.parseInt(st.nextToken()));
			}
			boolean isRev = false;
			for(int i = 0; i < fx.length(); i++) {
				if(fx.charAt(i) == 'R') {
					if(isRev) isRev = false;
					else isRev = true;
				} else if(fx.charAt(i) == 'D') {
					if(dQ.isEmpty()) {
						sb.append("error").append('\n');
						continue wh;
					}
					if(isRev) dQ.pollLast();
					else dQ.pollFirst();
				}
			}
			sb.append('[');
			while(dQ.size() > 0) {
				if(isRev) sb.append(dQ.pollLast());
				else sb.append(dQ.pollFirst());
				if(dQ.size() > 0) sb.append(',');
			}
			sb.append(']').append('\n');
		}
		System.out.println(sb);
	}
}