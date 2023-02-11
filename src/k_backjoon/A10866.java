package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A10866 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] dQ = new int[10000];
		StringBuilder sb = new StringBuilder();
		int startIdx = 0, curIdx = 0;
		while(N-- > 0) {
			String str = br.readLine();
			if(str.startsWith("push")) {
				str = str.substring(5, str.length());
				int num = 0;
				if(str.startsWith("front")) {
					num = Integer.parseInt(str.substring(10, str.length()));
				}
				else if(str.startsWith("back")) {
					num = Integer.parseInt(str.substring(9, str.length()));
				}
				dQ[curIdx++] = num;
			} else if(str.startsWith("pop")) {
				str = str.substring(4, str.length());
				if(str.startsWith("front")) {
					sb.append(curIdx - startIdx == 0 ? -1 : dQ[0]).append('\n');
				}
				else if(str.startsWith("back")) {
					sb.append(curIdx - startIdx == 0 ? -1 : dQ[curIdx--]).append('\n');
				}
			} else {
				switch(str) {
				case "size" :
					sb.append(curIdx - startIdx).append('\n');
					break;
				case "empty" :
					sb.append(curIdx - startIdx == 0 ? 1 : 0).append('\n');
					break;
				case "front" : 
					sb.append(curIdx - startIdx == 0 ? -1 : dQ[startIdx]).append('\n');
					break;
				case "back" : 
					sb.append(curIdx - startIdx == 0 ? -1 : dQ[curIdx - 1]).append('\n');
					break;
				}
			}
		}
		System.out.println(sb);
	}
}
