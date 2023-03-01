package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;

class A5430_1 {
	//시간 초과
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		wh : while(T-- > 0) {
			String fx = br.readLine();
			int n = Integer.parseInt(br.readLine());
			LinkedList<Integer> dQ = new LinkedList<>();
			String str = br.readLine();
			int idx = 1;
			for(int i = 0; i < n; i++) {
				String num = "";
				for(int j = idx; j < str.length(); j++) {
					if(str.charAt(j) >= '1' && str.charAt(j) <= '9') {
						num += str.charAt(j) + "";
					} else {
						idx = j + 1;
						break;
					}
				}
				dQ.offer(Integer.parseInt(num));
			}
			for(int i = 0; i < fx.length(); i++) {
				if(fx.charAt(i) == 'R') {
					Collections.reverse(dQ);
				} else if(fx.charAt(i) == 'D') {
					if(dQ.isEmpty()) {
						sb.append("error").append('\n');
						continue wh;
					} else {
						dQ.poll();
					}
				}
			}
			sb.append('[');
			int size = dQ.size();
			for(int i = 0; i < size; i++) {
				sb.append(dQ.poll());
				if(i == size - 1) break;
				sb.append(',');
			}
			sb.append(']').append('\n');
		}
		System.out.println(sb);
	}
}