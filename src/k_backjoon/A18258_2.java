package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A18258_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] Q = new int[2000000];
		StringBuilder sb = new StringBuilder();
		int startIdx = 0, curIdx = 0;
		while(N-- > 0) {
			String str = br.readLine();
			if(str.startsWith("push")) {
				int num = Integer.parseInt(str.substring(5, str.length()));
				Q[curIdx++] = num;
			} else {
				int size = curIdx - startIdx;
				switch(str) {
				case "pop" : 
					sb.append(size == 0 ? -1 : Q[startIdx++]).append('\n');
					break;
				case "size" :
					sb.append(size).append('\n');
					break;
				case "empty" :
					sb.append(size == 0 ? 1 : 0).append('\n');
					break;
				case "front" : 
					sb.append(size == 0 ? -1 : Q[startIdx]).append('\n');
					break;
				case "back" : 
					sb.append(size == 0 ? -1 : Q[curIdx - 1]).append('\n');
					break;
				}
			}
		}
		System.out.println(sb);
	}
}